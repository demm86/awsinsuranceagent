package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.impl.AgentServiceImpl;
import com.insuranceagency.awsinsurance.model.Agent;
import com.insuranceagency.awsinsurance.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgentController {

    @Autowired
    private AgentServiceImpl agentService;




    @RequestMapping(value = "api/agents", method = RequestMethod.GET)
    //public List<User> getUsers(@RequestHeader(value="Authorization") String token) {
    public List<Agent> getAgent() {
        List<Agent> test = agentService.getAgent();
        test.forEach(System.out::println);
        return test;
    }


}
