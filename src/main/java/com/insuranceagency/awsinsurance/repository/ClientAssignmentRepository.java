package com.insuranceagency.awsinsurance.repository;

import com.insuranceagency.awsinsurance.model.ClientAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientAssignmentRepository extends JpaRepository<ClientAssignment, Long> {
}
