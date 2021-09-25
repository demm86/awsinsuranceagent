package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.impl.AgentAssignmentImpl;
import com.insuranceagency.awsinsurance.model.AgentAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentAssignmentController {

    @Autowired
    private AgentAssignmentImpl agentAssignmentService;

    @RequestMapping(value = "api/agentAssignments", method = RequestMethod.GET)
    public List<AgentAssignment> getAgentAssignment() {
        List<AgentAssignment> list = agentAssignmentService.getAgentAssignment();
        return list;
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

    @RequestMapping(value = "/api/agentAssignment/{id}", method = RequestMethod.GET)
    public AgentAssignment getAgentAssignmentById(@PathVariable("id") long id){
        return agentAssignmentService.getAgentAssignmentById(id);
    }

}
