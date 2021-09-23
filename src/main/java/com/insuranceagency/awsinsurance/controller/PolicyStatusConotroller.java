package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.PolicyStatusService;
import com.insuranceagency.awsinsurance.model.Employee;
import com.insuranceagency.awsinsurance.repository.PolicyStatusRepository;
import com.insuranceagency.awsinsurance.model.PolicyStatus;
import com.insuranceagency.awsinsurance.utils.RegisterExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PolicyStatusConotroller {

    @Autowired
    private PolicyStatusService policyStatusService;

    @RequestMapping(value = "api/policystatus", method = GET)

    public List<PolicyStatus> getPolicyStatus() {
        List<PolicyStatus> test = policyStatusService.getPolicyStatus();
        test.forEach(System.out::println);
        return test;
    }

    @RequestMapping(value = "/api/policystatus", method = RequestMethod.POST)
    public ResponseEntity<PolicyStatus> savePolicyStatus(@RequestBody PolicyStatus policyStatus) {
        try {
            PolicyStatus response = policyStatusService.savePolicyStatus(policyStatus);
            return new ResponseEntity<PolicyStatus>(response, HttpStatus.OK);

        } catch (RegisterExistException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/api/policystatus", method = RequestMethod.PUT)
    public PolicyStatus updatePolicyStatus(@RequestBody PolicyStatus policyStatus) {
        return policyStatusService.updatePolicyStatus(policyStatus);
    }


    @RequestMapping(value = "api/policystatus/{id}", method = RequestMethod.DELETE)
    public void deletePolicyStatus(@PathVariable Long id) {
        policyStatusService.deletePolicyStatusById(id);
    }

    @RequestMapping(value = "/api/description/{desc}", method = RequestMethod.GET)
    public PolicyStatus policyStatusDescription (@PathVariable String desc) {
        return policyStatusService.getPolicyStatusByDescription(desc);
    }
}
