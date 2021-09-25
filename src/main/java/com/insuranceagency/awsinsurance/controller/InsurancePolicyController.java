package com.insuranceagency.awsinsurance.controller;


import com.insuranceagency.awsinsurance.dao.InsurancePolicyService;
import com.insuranceagency.awsinsurance.repository.InsurancePolicyRepository;
import com.insuranceagency.awsinsurance.model.InsurancePolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InsurancePolicyController {
    @Autowired
    private InsurancePolicyService insurancePolicyService;

    @RequestMapping(value = "api/InsurancePolicy", method = RequestMethod.GET)
    public List<InsurancePolicy> getInsurancePolicy() {
        List<InsurancePolicy> test = insurancePolicyService.getInsurancePolicy();
        return test;
    }

    @RequestMapping(value = "api/InsurancePolicy", method = RequestMethod.POST)
    public InsurancePolicy saveInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy){
        return insurancePolicyService.saveInsurancePolicy(insurancePolicy);
    }

    @RequestMapping(value = "api/InsurancePolicy", method = RequestMethod.PUT)
    public InsurancePolicy updateInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy){
        return insurancePolicyService.updateInsurancePolicy(insurancePolicy);
    }

    @RequestMapping(value = "api/InsurancePolicy/{id}", method = RequestMethod.DELETE)
    public void deleteInsurancePolicy(@PathVariable("id") long id){
        insurancePolicyService.deleteInsurancePolicyById(id);
    }

    @RequestMapping(value = "api/InsurancePolicy/{id}", method = RequestMethod.GET)
    public InsurancePolicy getInsurancePolicyById(@PathVariable("id") long id){
        return insurancePolicyService.getInsurancePolicyById(id);
    }
}
