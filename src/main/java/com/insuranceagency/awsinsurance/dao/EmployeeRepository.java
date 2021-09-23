package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
