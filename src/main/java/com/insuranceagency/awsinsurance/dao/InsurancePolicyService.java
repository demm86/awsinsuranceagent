package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.InsurancePolicy;
import java.util.List;
public interface InsurancePolicyService {
    List<InsurancePolicy> getInsurancePolicy();

    InsurancePolicy saveInsurancePolicy(InsurancePolicy agent);
    InsurancePolicy updateInsurancePolicy(InsurancePolicy agent);
    InsurancePolicy getInsurancePolicyById(Long id);
    void deleteInsurancePolicyById(Long id);
}
