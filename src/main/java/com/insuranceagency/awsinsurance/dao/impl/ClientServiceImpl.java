package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.ClientService;
import com.insuranceagency.awsinsurance.model.Client;
import com.insuranceagency.awsinsurance.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    @PersistenceContext
    EntityManager entityManager;
    private final ClientRepository clientRepository;

    @Override
    public List<Client> getClient() {
        String query = "FROM Client";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Client saveClient(Client client) throws Exception {
        try{
            return clientRepository.save(client);
        }
        catch(Exception e) {
            throw e;
        }
    }

    @Override
    public Client updateClient(Client client) {
        Client clientUpdate = clientRepository.getById(client.getIdClient());
        clientUpdate.setIdEmployee(client.getIdEmployee());
        clientUpdate.setFirstName(client.getFirstName());
        clientUpdate.setLastName(client.getLastName());
        clientUpdate.setAddress(client.getAddress());
        clientUpdate.setEmail(client.getEmail());
        clientUpdate.setPhone(client.getPhone());
        clientUpdate.setBirthday(client.getBirthday());
        return clientRepository.save(clientUpdate);
    }

    @Override
    public Client getClientById(Long id) {
        Client client = clientRepository.getById(id);
        return client;
    }

    @Override
    public void deleteClientById(Long id) {
        Client clientDelete = clientRepository.getById(id);
        clientRepository.delete(clientDelete);
    }
}
