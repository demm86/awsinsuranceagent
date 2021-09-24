package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.PolicyTypeService;
import com.insuranceagency.awsinsurance.model.PolicyType;
import com.insuranceagency.awsinsurance.repository.PolicyTypeRepository;
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
@Transactional
@Slf4j
public class PolicyTypeImp implements PolicyTypeService {
    @PersistenceContext
    EntityManager entityManager;

    private final PolicyTypeRepository policyTypeRepository;

    @Override
    public List<PolicyType> getPolicyType() {


        String query = "FROM PolicyType";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public PolicyType savePolicyType(PolicyType policyType) {
        return policyTypeRepository.save(policyType);
    }

    @Override
    public PolicyType updatePolicyType(PolicyType policyType) {
        PolicyType pol = policyTypeRepository.getById(policyType.getIdType());
        pol.setIdType(policyType.getIdType());
        pol.setDescription(policyType.getDescription());
        pol.setPeriod(policyType.getPeriod());
        pol.setValue(policyType.getValue());
        pol.setAllowDependent(policyType.isAllowDependent());
        pol.setMaxDependent(policyType.getMaxDependent());
        pol.setComission(policyType.getComission());
        return policyTypeRepository.save(pol);
    }

    @Override
    public PolicyType getPolicyType(Long id) {
        return null;
    }

    @Override
    public void deletePolicyTypeById(Long id) {
        PolicyType pol = policyTypeRepository.getById(id);
        policyTypeRepository.delete(pol);
    }

}
