package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.UserService;
import com.insuranceagency.awsinsurance.model.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserServiceImpl implements UserService {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Users> getUsers() {
        String query = "FROM Users";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Users saveUser(Users user) {
        return null;
    }

    @Override
    public Users updateUser(Users user) {
        return null;
    }

    @Override
    public Users getUserById(Long id) {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
