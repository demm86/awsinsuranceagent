package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.AgentAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentAssignmentRepository extends JpaRepository<AgentAssignment, Long> {
}
