package com.insuranceagency.awsinsurance.repository;

import com.insuranceagency.awsinsurance.model.Employee;
import com.insuranceagency.awsinsurance.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByFirstName (String FirsName);

}
