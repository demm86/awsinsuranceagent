package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.AgentAssignment;

import java.util.List;

public interface AgentAssignmentService {

    List<AgentAssignment> getAgentAssignment();

    AgentAssignment saveAgentAssignment(AgentAssignment agent);
    AgentAssignment updateUserAssignment(AgentAssignment agent);
    AgentAssignment getAgentAssignmentById(Long id);
    void deleteAgentAssignmentById(Long id);
}
