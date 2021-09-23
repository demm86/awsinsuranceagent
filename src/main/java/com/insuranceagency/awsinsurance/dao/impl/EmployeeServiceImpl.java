package com.insuranceagency.awsinsurance.dao.impl;

//import com.insuranceagency.awsinsurance.dao.EmployeeService;
import com.insuranceagency.awsinsurance.model.Employee;
import com.insuranceagency.awsinsurance.model.Profile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeServiceImpl /*implements EmployeeService*/ {

    @PersistenceContext
    EntityManager entityManager;
/*
    @Override
    public List<Employee> getEmployee() {
        String query = "FROM Employee";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void deleteEmployeeById(Long id) {

    }
    */

}
