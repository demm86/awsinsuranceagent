package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.ClientService;
import com.insuranceagency.awsinsurance.model.AgentAssignment;
import com.insuranceagency.awsinsurance.model.Client;
import com.insuranceagency.awsinsurance.utils.RegisterExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "api/client", method = RequestMethod.GET)
    public List<Client> getClient() {
        List<Client> test = clientService.getClient();
        return test;
    }

    @RequestMapping(value = "api/client", method = RequestMethod.POST)
    public ResponseEntity<Client> saveclient(@RequestBody Client client)  {
        try {
            Client response = clientService.saveClient(client);
            return new ResponseEntity<Client>(response, HttpStatus.OK);

        } catch (RegisterExistException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "api/client", method = RequestMethod.PUT)
    public Client updateClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }

    @RequestMapping(value = "api/client/{id}", method = RequestMethod.DELETE)
    public void deleteClient(@PathVariable long id){
        clientService.deleteClientById(id);
    }
}
