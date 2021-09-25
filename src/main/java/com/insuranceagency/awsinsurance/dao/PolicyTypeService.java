package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.PolicyType;

import java.util.List;

public interface PolicyTypeService {
    List<PolicyType> getPolicyType();

    PolicyType savePolicyType(PolicyType agent);
    PolicyType updatePolicyType(PolicyType agent);
    PolicyType getPolicyTypeById(Long id);
    void deletePolicyTypeById(Long id);
}
