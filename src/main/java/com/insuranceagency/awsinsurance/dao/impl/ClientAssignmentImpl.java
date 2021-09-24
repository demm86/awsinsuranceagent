package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.ClientAssignmentService;
import com.insuranceagency.awsinsurance.model.ClientAssignment;
import com.insuranceagency.awsinsurance.repository.ClientAssignmentRepository;
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
public class ClientAssignmentImpl implements ClientAssignmentService {
    @PersistenceContext
    EntityManager entityManager;
    private final ClientAssignmentRepository clientAssignmentRepository;

    @Override
    public List<ClientAssignment> getClientAssignment() {
        String query = "FROM ClientAssignment";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public ClientAssignment saveClientAssignment(ClientAssignment clientAssignment) {
        return clientAssignmentRepository.save(clientAssignment);
    }

    @Override
    public ClientAssignment updateClientAssignment(ClientAssignment clientAssignment) {
        ClientAssignment temp = clientAssignmentRepository.getById(clientAssignment.getIdClientAssignments());
        temp.setIdAgentEmployee(clientAssignment.getIdAgentEmployee());
        temp.setIdClient(clientAssignment.getIdClient());
        temp.setActive(clientAssignment.isActive());
        return clientAssignmentRepository.save(temp);
    }

    @Override
    public ClientAssignment getClientAssignmentById(Long id) {
        ClientAssignment clientAssignment = clientAssignmentRepository.getById(id);
        return clientAssignment;
    }

    @Override
    public void deleteClientAssignmentById(Long id) {
        ClientAssignment temp = clientAssignmentRepository.getById(id);
        clientAssignmentRepository.delete(temp);
    }
}
