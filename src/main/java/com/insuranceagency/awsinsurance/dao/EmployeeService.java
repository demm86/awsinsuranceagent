package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployee();

    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    Employee getEmployeeById(Employee employee);
    Employee deleteEmployeeById(Employee employee);

}
