package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.DependentService;
import com.insuranceagency.awsinsurance.model.Dependent;
import com.insuranceagency.awsinsurance.repository.DependentRepository;
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
public class DependentImpl implements DependentService {
    @PersistenceContext
    EntityManager entityManager;
    private final DependentRepository dependentRepository;

    @Override
    public List<Dependent> getDependents() {
        String query = "FROM Dependent";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Dependent saveDependent(Dependent dependent) {
        return dependentRepository.save(dependent);
    }

    @Override
    public Dependent updateDependent(Dependent dependent) {
        Dependent temp = dependentRepository.getById(dependent.getIdDependent());
        temp.setFirstName(dependent.getFirstName());
        temp.setLastName(dependent.getLastName());
        temp.setEmail(dependent.getEmail());
        temp.setBirthday(dependent.getBirthday());
        temp.setPhone(dependent.getPhone());
        temp.setIdInsurancePolicy(dependent.getIdInsurancePolicy());
        return dependentRepository.save(temp);
    }

    @Override
    public Dependent getDependentById(Long id) {
        Dependent dependent = dependentRepository.getById(id);
        return  dependent;
    }

    @Override
    public void deleteDependentById(Long id) {
        Dependent dependent = dependentRepository.getById(id);
        dependentRepository.delete(dependent);
    }
}
