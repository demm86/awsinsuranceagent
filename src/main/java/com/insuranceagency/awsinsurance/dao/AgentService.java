package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Agent;

import java.util.List;

public interface AgentService {

    List<Agent> getAgent();

    Agent saveAgent(Agent agent);
    Agent updateUser(Agent agent);
    Agent getAgentById(Agent id);
    void deleteAgentById(Agent id);
}
