package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.PolicyStatusService;
import com.insuranceagency.awsinsurance.model.PolicyStatus;
import com.insuranceagency.awsinsurance.repository.PolicyStatusRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j

public class PolicyStatusServiceImpl implements PolicyStatusService {

    @PersistenceContext
    EntityManager entityManager;

    private final PolicyStatusRepository policyStatusRepository;

    @Override
    public List<PolicyStatus> getPolicyStatus() {
        String query = "FROM PolicyStatus";
        return entityManager.createQuery(query).getResultList();    }

    @Override
    public PolicyStatus savePolicyStatus(PolicyStatus policyStatus) throws Exception {
        try{
            return policyStatusRepository.save(policyStatus);
        }
        catch(Exception e) {
            throw e;
        }
    }

    @Override
    public PolicyStatus updatePolicyStatus(PolicyStatus policyStatus) {
        return null;
    }

    @Override
    public PolicyStatus getPolicyStatusById(Long id) {
        return null;
    }

    @Override
    public PolicyStatus getPolicyStatusByDescription(String descriptionInfo) {
        return null;
    }

    @Override
    public void deletePolicyStatusById(Long id) {

    }
}
