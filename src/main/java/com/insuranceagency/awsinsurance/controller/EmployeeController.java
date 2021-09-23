package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.EmployeeService;
import com.insuranceagency.awsinsurance.model.Employee;
import com.insuranceagency.awsinsurance.model.Users;
import com.insuranceagency.awsinsurance.utils.RegisterExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/api/employee", method = RequestMethod.GET)
    public List<Employee> getUsers() {
        List<Employee> test = employeeService.getEmployee();
        test.forEach(System.out::println);
        return test;
    }

    @RequestMapping(value = "/api/employee", method = RequestMethod.POST)
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        try{
             Employee response = employeeService.saveEmployee(employee);
            return new ResponseEntity<Employee>(response, HttpStatus.OK);

            } catch (RegisterExistException ex) {
                  return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
    }

    @RequestMapping(value = "/api/employee", method = RequestMethod.PUT)
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }


    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
    }

    @RequestMapping(value = "/api/employeeFirstName/{alias}", method = RequestMethod.GET)
    public Employee employeeFirstName( @PathVariable String alias) {
        return employeeService.getEmployeeByFirstName(alias);
    }
}
