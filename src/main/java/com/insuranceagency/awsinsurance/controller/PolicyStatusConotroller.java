package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.PolicyStatusRepository;
import com.insuranceagency.awsinsurance.model.AgentAssignment;
import com.insuranceagency.awsinsurance.model.PolicyStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PolicyStatusConotroller {

    @Autowired
    private PolicyStatusRepository policyStatusRepository;

    @RequestMapping(value = "api/policystatus", method = GET)

    public List<PolicyStatus> getPolicyStatus() {
        List<PolicyStatus> test = policyStatusRepository.findAll();
        test.forEach(System.out::println);
        return test;
    }

    @RequestMapping(value = "api/policystatus", method = RequestMethod.POST)
    public PolicyStatus savePolicyStatus(@RequestBody PolicyStatus policyStatus){
        PolicyStatus response = policyStatusRepository.save(policyStatus);
        return response;
    }
}
