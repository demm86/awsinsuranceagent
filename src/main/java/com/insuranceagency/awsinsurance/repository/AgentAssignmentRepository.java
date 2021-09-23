package com.insuranceagency.awsinsurance.repository;

import com.insuranceagency.awsinsurance.model.AgentAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentAssignmentRepository extends JpaRepository<AgentAssignment, Long> {
}
