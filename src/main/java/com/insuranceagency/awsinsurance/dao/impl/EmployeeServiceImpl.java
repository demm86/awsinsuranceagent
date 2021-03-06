package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.EmployeeService;
import com.insuranceagency.awsinsurance.model.Employee;
import com.insuranceagency.awsinsurance.repository.EmployeeRepository;
import com.insuranceagency.awsinsurance.repository.UsersRepo;
import com.insuranceagency.awsinsurance.utils.RegisterExistException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//@Repository
@Service @RequiredArgsConstructor @Transactional @Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @PersistenceContext
    EntityManager entityManager;

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployee() {
        String query = "FROM Employee";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        try{
            return employeeRepository.save(employee);
        }
        catch(Exception e) {
            throw e;
        }
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
    public Employee getEmployeeByFirstName(String Alias) {
        return null;
    }

    @Override
    public void deleteEmployeeById(Long id) {

    }


}
