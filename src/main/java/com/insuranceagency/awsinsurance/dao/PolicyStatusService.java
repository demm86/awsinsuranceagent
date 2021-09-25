package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Employee;
import com.insuranceagency.awsinsurance.model.PolicyStatus;

import java.util.List;

public interface PolicyStatusService {
    List<PolicyStatus> getPolicyStatus();

    PolicyStatus savePolicyStatus(PolicyStatus policyStatus) throws Exception;;
    PolicyStatus updatePolicyStatus(PolicyStatus policyStatus);
    PolicyStatus getPolicyStatusById(Long id);
    void deletePolicyStatusById(Long id);
}
