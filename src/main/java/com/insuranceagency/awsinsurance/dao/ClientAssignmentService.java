package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.ClientAssignment;

import java.util.List;

public interface ClientAssignmentService {

    List<ClientAssignment> getClientAssignment();

    ClientAssignment saveClientAssignment(ClientAssignment clientAssignment);
    ClientAssignment updateClientAssignment(ClientAssignment clientAssignment);
    ClientAssignment getClientAssignmentById(Long id);
    void deleteClientAssignmentById(Long id);
}
