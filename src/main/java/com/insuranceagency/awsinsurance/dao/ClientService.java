package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getClient();

    Client saveClient(Client client) throws Exception;
    Client updateClient(Client client);
    Client getClientById(Long id);
    void deleteClientById(Long id);

}
