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

    private final InsurancePolicyRepository InsurancePolicyRepository;

    @Override
    public List<InsurancePolicy> getInsurancePolicy()  {
        String query = "FROM InsurancePolicy";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public InsurancePolicy saveInsurancePolicy(InsurancePolicy insurancePolicy) {
        return InsurancePolicyRepository.save(insurancePolicy);
    }

    public InsurancePolicy updateInsurancePolicy(InsurancePolicy insurancePolicy) {
        InsurancePolicy temp = InsurancePolicyRepository.getById(insurancePolicy.getIdInsurancePolicy());
        temp.setIdInsurancePolicy(insurancePolicy.getIdInsurancePolicy());
        temp.setIdClient(insurancePolicy.getIdClient());
        temp.setSellIDAgent(insurancePolicy.getSellIDAgent());
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
        return InsurancePolicyRepository.save(temp);
    }

    @Override
    public InsurancePolicy getInsurancePolicyById(Long id) {
        return null;
    }

    @Override
    public void deleteInsurancePolicyById(Long id) {
        InsurancePolicy temp = InsurancePolicyRepository.getById(id);
        InsurancePolicyRepository.delete(temp);
    }
}
