package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.AgentService;
import com.insuranceagency.awsinsurance.model.Agent;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class AgentServiceImpl implements AgentService {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Agent> getAgent() {
        String query = "FROM Agent";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Agent saveAgent(Agent agent) {
        return null;
    }

    @Override
    public Agent updateUser(Agent agent) {
        return null;
    }

    @Override
    public Agent getAgentById(Agent id) {
        return null;
    }

    @Override
    public void deleteAgentById(Agent id) {

    }
}
