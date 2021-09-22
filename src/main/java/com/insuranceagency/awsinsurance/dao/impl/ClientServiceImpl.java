package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.ClientService;
import com.insuranceagency.awsinsurance.model.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ClientServiceImpl implements ClientService {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Client> getClient() {
        String query = "FROM Clients";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Client saveClient(Client client) {
        return null;
    }

    @Override
    public Client updateClient(Client user) {
        return null;
    }

    @Override
    public Client getClientById(Long id) {
        return null;
    }

    @Override
    public void deleteClientById(Long id) { }
}
