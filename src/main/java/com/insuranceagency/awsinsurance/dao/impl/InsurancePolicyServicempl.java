package com.insuranceagency.awsinsurance.dao.impl;
import com.insuranceagency.awsinsurance.dao.InsurancePolicyService;
import com.insuranceagency.awsinsurance.model.AgentAssignment;
import com.insuranceagency.awsinsurance.model.InsurancePolicy;
import com.insuranceagency.awsinsurance.repository.InsurancePolicyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Service
@RequiredArgsConstructor
@Transactional @Slf4j
public class InsurancePolicyServicempl implements InsurancePolicyService {
    @PersistenceContext
    EntityManager entityManager;

    private final InsurancePolicyRepository insurancePolicyRepository;

    @Override
    public List<InsurancePolicy> getInsurancePolicy()  {
        String query = "FROM InsurancePolicy";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public InsurancePolicy saveInsurancePolicy(InsurancePolicy insurancePolicy) {
        return insurancePolicyRepository.save(insurancePolicy);
    }

    public InsurancePolicy updateInsurancePolicy(InsurancePolicy insurancePolicy) {
        InsurancePolicy temp = insurancePolicyRepository.getById(insurancePolicy.getIdInsurancePolicy());
        temp.setIdInsurancePolicy(insurancePolicy.getIdInsurancePolicy());
        temp.setIdClient(insurancePolicy.getIdClient());
        temp.setSellIdAgent(insurancePolicy.getSellIdAgent());
        temp.setIdType(insurancePolicy.getIdType());
        temp.setIdStatus(insurancePolicy.getIdStatus());
        temp.setPeriod(insurancePolicy.getPeriod());
        temp.setValue(insurancePolicy.getPeriod());
        temp.setDeductible(insurancePolicy.getDeductible());
        temp.setCoverageAmount(insurancePolicy.getCoverageAmount());
        temp.setCoveragePerior(insurancePolicy.getCoveragePerior());
        temp.setMonthlyFee(insurancePolicy.getMonthlyFee());
        temp.setComission(insurancePolicy.getComission());
        temp.setActive(insurancePolicy.isActive());
        return insurancePolicyRepository.save(temp);
    }

    @Override
    public InsurancePolicy getInsurancePolicyById(Long id) {
        InsurancePolicy insurancePolicy = insurancePolicyRepository.getById(id);
        return insurancePolicy;
    }

    @Override
    public void deleteInsurancePolicyById(Long id) {
        InsurancePolicy temp = insurancePolicyRepository.getById(id);
        insurancePolicyRepository.delete(temp);
    }
}
