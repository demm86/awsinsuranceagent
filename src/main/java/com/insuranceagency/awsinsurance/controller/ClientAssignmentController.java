package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.impl.ClientAssignmentImpl;
import com.insuranceagency.awsinsurance.model.ClientAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientAssignmentController {

    @Autowired
    private ClientAssignmentImpl clientAssignmentService;

    @RequestMapping(value = "api/clientAssignments", method = RequestMethod.GET)
    public List<ClientAssignment> getClientAssignment() {
        List<ClientAssignment> list = clientAssignmentService.getClientAssignment();
        return list;
    }

    @RequestMapping(value = "api/clientAssignments", method = RequestMethod.POST)
    public ClientAssignment saveClientAssignment(@RequestBody ClientAssignment clientAssignment){
        return clientAssignmentService.saveClientAssignment(clientAssignment);
    }

    @RequestMapping(value = "api/clientAssignments", method = RequestMethod.PUT)
    public ClientAssignment updateClientAssignment(@RequestBody ClientAssignment clientAssignment){
        return clientAssignmentService.updateClientAssignment(clientAssignment);
    }

    @RequestMapping(value = "api/clientAssignments/{id}", method = RequestMethod.DELETE)
    public void deleteClientAssignment(@PathVariable("id") long id){
        clientAssignmentService.deleteClientAssignmentById(id);
    }

    @RequestMapping(value = "api/clientAssignments/{id}", method = RequestMethod.GET)
    public ClientAssignment getClientAssignmentById(@PathVariable("id") Long id){
        return clientAssignmentService.getClientAssignmentById(id);
    }
}
