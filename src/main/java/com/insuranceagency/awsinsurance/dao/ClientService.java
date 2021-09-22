package com.insuranceagency.awsinsurance.dao;


import com.insuranceagency.awsinsurance.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getClient();

    Client saveClient(Client client);
    Client updateClient(Client client);
    Client getAgentById(Client id);
    void deleteAgentById(Client id);

}
