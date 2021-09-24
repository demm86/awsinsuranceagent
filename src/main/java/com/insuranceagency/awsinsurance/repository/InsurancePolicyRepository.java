package com.insuranceagency.awsinsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.insuranceagency.awsinsurance.model.InsurancePolicy;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {
}
