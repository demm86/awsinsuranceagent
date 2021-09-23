package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Dependent;

import java.util.List;

public interface DependentService {

    List<Dependent> getDependents();

    Dependent saveDependent(Dependent dependent);
    Dependent updateDependent(Dependent dependent);
    Dependent getDependentById(Long id);
    void deleteDependentById(Long id);
}
