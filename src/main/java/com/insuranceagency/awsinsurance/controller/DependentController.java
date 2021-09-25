package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.impl.DependentImpl;
import com.insuranceagency.awsinsurance.model.Dependent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DependentController {

    @Autowired
    private DependentImpl dependentService;

    @RequestMapping(value = "api/dependents", method = RequestMethod.GET)
    public List<Dependent> getAgentAssignment() {
        List<Dependent> list = dependentService.getDependents();
        return list;
    }

    @RequestMapping(value = "api/dependent", method = RequestMethod.POST)
    public Dependent saveAgentAssignment(@RequestBody Dependent dependent){
        return dependentService.saveDependent(dependent);
    }

    @RequestMapping(value = "api/dependent", method = RequestMethod.PUT)
    public Dependent updateAgentAssignment(@RequestBody Dependent dependent){
        return dependentService.updateDependent(dependent);
    }

    @RequestMapping(value = "api/dependent/{id}", method = RequestMethod.DELETE)
    public void deleteAgentAssignment(@PathVariable("id") long id){
        dependentService.deleteDependentById(id);
    }

    @RequestMapping(value = "/api/dependent/{id}", method = RequestMethod.GET)
    public Dependent getAgentAssignmentById(@PathVariable("id") long id){
        return dependentService.getDependentById(id);
    }
}
