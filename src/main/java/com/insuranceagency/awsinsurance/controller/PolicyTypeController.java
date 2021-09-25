package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.PolicyTypeService;
import com.insuranceagency.awsinsurance.model.PolicyType;
import com.insuranceagency.awsinsurance.repository.PolicyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PolicyTypeController {
    @Autowired
    private PolicyTypeService policyTypeService;

    @RequestMapping(value = "api/policyTypeService", method = RequestMethod.GET)
    public List<PolicyType> getPolicyTypes() {
        List<PolicyType> test = policyTypeService.getPolicyType();
        return test;
    }

    @RequestMapping(value = "api/policyTypeService", method = RequestMethod.POST)
    public PolicyType savePolicyTypes(@RequestBody PolicyType policyType){
        return policyTypeService.savePolicyType(policyType);
    }

    @RequestMapping(value = "api/policyTypeService", method = RequestMethod.PUT)
    public PolicyType updatePolicyTypes(@RequestBody PolicyType policyType){
        return policyTypeService.updatePolicyType(policyType);
    }

    @RequestMapping(value = "api/policyTypeService/{id}", method = RequestMethod.DELETE)
    public void deleteInsurancePolicy(@PathVariable("id") long id){
        policyTypeService.deletePolicyTypeById(id);
    }

    @RequestMapping(value = "api/policyTypeService/{id}", method = RequestMethod.GET)
    public PolicyType getPolicyTypeById(@PathVariable("id") long id){
        return policyTypeService.getPolicyTypeById(id);
    }
}
