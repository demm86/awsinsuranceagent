package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.UserService;
import com.insuranceagency.awsinsurance.model.Users;
import com.insuranceagency.awsinsurance.repository.UsersRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//@Repository
//@Transactional
@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService {

    @PersistenceContext
    EntityManager entityManager;
    private final UsersRepo usersRepo;

    @Override
    public List<Users> getUsers() {
        String query = "FROM Users";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Users saveUser(Users user) {
        return usersRepo.save(user);
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
    public Users getUserByAlias(String Alias) {
        Users test =usersRepo.findByUserAlias(Alias);

        return test;
    }

    @Override
    public void deleteUserById(Long id) {

    }


}
