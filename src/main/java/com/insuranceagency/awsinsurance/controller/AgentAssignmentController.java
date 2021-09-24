package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.AgentAssignmentService;
import com.insuranceagency.awsinsurance.repository.AgentAssignmentRepository;
import com.insuranceagency.awsinsurance.model.AgentAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AgentAssignmentController {

    @Autowired
    private AgentAssignmentService agentAssignmentService;

    @RequestMapping(value = "api/agentAssignments", method = RequestMethod.GET)
    public List<AgentAssignment> getAgentAssignment() {
        List<AgentAssignment> test = agentAssignmentService.getAgentAssignment();
        return test;
    }

    @RequestMapping(value = "api/agentAssignment", method = RequestMethod.POST)
    public AgentAssignment saveAgentAssignment(@RequestBody AgentAssignment agentAssignment){
        return agentAssignmentService.saveAgentAssignment(agentAssignment);
    }

    @RequestMapping(value = "api/agentAssignment", method = RequestMethod.PUT)
    public AgentAssignment updateAgentAssignment(@RequestBody AgentAssignment agentAssignment){
        return agentAssignmentService.updateUserAssignment(agentAssignment);
    }

    @RequestMapping(value = "api/agentAssignment/{id}", method = RequestMethod.DELETE)
    public void deleteAgentAssignment(@PathVariable("id") long id){
        agentAssignmentService.deleteAgentAssignmentById(id);
    }

}
