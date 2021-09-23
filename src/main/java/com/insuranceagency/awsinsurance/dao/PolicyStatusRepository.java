package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Client;
import com.insuranceagency.awsinsurance.model.PolicyStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyStatusRepository extends JpaRepository<PolicyStatus, Long> {


}
