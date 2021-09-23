package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.AgentAssignmentRepository;
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
    private AgentAssignmentRepository agentAssignmentRepository;

    @RequestMapping(value = "api/agentAssignments", method = RequestMethod.GET)
    //public List<User> getUsers(@RequestHeader(value="Authorization") String token) {
    public List<AgentAssignment> getAgentAssignment() {
        List<AgentAssignment> test = agentAssignmentRepository.findAll();
        test.forEach(System.out::println);
        return test;
    }

    @RequestMapping(value = "api/agentAssignments", method = RequestMethod.POST)
    public AgentAssignment saveAgentAssignment(@RequestBody AgentAssignment agentAssignment){
        AgentAssignment response = agentAssignmentRepository.save(agentAssignment);
        return response;
    }

    @RequestMapping(value = "api/agentAssignment/{id}", method = RequestMethod.PUT)
    public AgentAssignment updateAgentAssignment(@PathVariable("id") long idAgentAssignments, @RequestBody AgentAssignment agentAssignment){
        Optional<AgentAssignment> data = agentAssignmentRepository.findById(idAgentAssignments);
        if(data.isPresent()){
            AgentAssignment _agentAssignment = data.get();
            _agentAssignment.setIdAgentAssignments(agentAssignment.getIdAgentAssignments());
            _agentAssignment.setIdEmployees(agentAssignment.getIdEmployees());
            _agentAssignment.setIdAgent(agentAssignment.getIdAgent());
            _agentAssignment.setActive(agentAssignment.isActive());
            AgentAssignment response = agentAssignmentRepository.save(_agentAssignment);
            return response;
        }else{
            return null;
        }
    }

    @RequestMapping(value = "api/agentAssignment/delete/{id}")
    public ResponseEntity<HttpStatus> deleteAgentAssignment(@PathVariable("id") long idAgentAssignments){
        try{
            agentAssignmentRepository.deleteById(idAgentAssignments);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
