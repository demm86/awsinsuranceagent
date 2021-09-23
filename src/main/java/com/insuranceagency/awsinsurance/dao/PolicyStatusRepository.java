package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Client;
import com.insuranceagency.awsinsurance.model.PolicyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PolicyStatusRepository extends JpaRepository<PolicyStatus, Long> {


}
