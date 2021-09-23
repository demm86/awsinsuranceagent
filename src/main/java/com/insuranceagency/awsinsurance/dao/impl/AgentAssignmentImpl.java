package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.AgentAssignmentService;
import com.insuranceagency.awsinsurance.model.AgentAssignment;
import com.insuranceagency.awsinsurance.repository.AgentAssignmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Service
@RequiredArgsConstructor
@Transactional @Slf4j
public class AgentAssignmentImpl implements AgentAssignmentService {
    @PersistenceContext
    EntityManager entityManager;
    private final AgentAssignmentRepository agentAssignmentRepository;


    @Override
    public List<AgentAssignment> getAgentAssignment() {
        String query = "FROM AgentAssignment";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public AgentAssignment saveAgentAssignment(AgentAssignment agentAssignment) {
        return agentAssignmentRepository.save(agentAssignment);
    }

    @Override
    public AgentAssignment updateUserAssignment(AgentAssignment agentAssignment) {
        AgentAssignment temp = agentAssignmentRepository.getById(agentAssignment.getIdAgentAssignments());
        temp.setIdEmployees(agentAssignment.getIdEmployees());
        temp.setIdAgent(agentAssignment.getIdAgent());
        temp.setActive(agentAssignment.isActive());
        return agentAssignmentRepository.save(temp);
    }

    @Override
    public AgentAssignment getAgentAssignmentById(Long id) {
        return null;
    }

    @Override
    public void deleteAgentAssignmentById(Long id) {
        AgentAssignment temp = agentAssignmentRepository.getById(id);
        agentAssignmentRepository.delete(temp);
    }
}
