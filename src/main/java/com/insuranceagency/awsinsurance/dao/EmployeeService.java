package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Employee;
import com.insuranceagency.awsinsurance.model.Users;

import java.util.List;

public interface EmployeeService {


    List<Employee> getEmployee();

    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee getEmployeeByFirstName(String Alias);
    void deleteEmployeeById(Long id);

}
