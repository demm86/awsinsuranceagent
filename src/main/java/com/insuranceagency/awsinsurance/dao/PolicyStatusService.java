package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Client;
import com.insuranceagency.awsinsurance.model.PolicyStatus;

import java.util.List;

public interface PolicyStatusService {

    List<PolicyStatus> getPolicyStatus();

    PolicyStatus savePolicyStatus (PolicyStatus policyStatus);
    PolicyStatus updatePolicyStatus(PolicyStatus policyStatus);
    PolicyStatus getPolicyStatusById(Long id);
    void deletePolicyStatusById(Long id);
}
