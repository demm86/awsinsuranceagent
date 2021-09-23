package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.AgentAssignmentRepository;
import com.insuranceagency.awsinsurance.dao.impl.AgentAssignmentServiceImpl;
import com.insuranceagency.awsinsurance.model.AgentAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgentAssignmentController {

    @Autowired
    private AgentAssignmentRepository agentAssignmentRepository;

    @RequestMapping(value = "api/agentAssignments", method = RequestMethod.GET)
    //public List<User> getUsers(@RequestHeader(value="Authorization") String token) {
    public List<AgentAssignment> getAgentAssignment() {
        List<AgentAssignment> test = agentAssignmentRepository.findAll();
        test.forEach(System.out::println);
        return test;
    }

    @RequestMapping(value = "api/AgentAssignments", method = RequestMethod.POST)
    public AgentAssignment saveAgentAssignment(@RequestBody AgentAssignment agentAssignment){
        AgentAssignment response = agentAssignmentRepository.save(agentAssignment);
        return response;
    }

}
