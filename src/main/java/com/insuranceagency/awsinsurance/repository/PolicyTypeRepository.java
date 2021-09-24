package com.insuranceagency.awsinsurance.repository;
import com.insuranceagency.awsinsurance.model.PolicyType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyTypeRepository extends JpaRepository<PolicyType, Long> {
}
