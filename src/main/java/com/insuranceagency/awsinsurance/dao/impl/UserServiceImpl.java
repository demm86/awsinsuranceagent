package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.UsersService;
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
public class UserServiceImpl implements UsersService {

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
        Users usersTmp = usersRepo.getById(user.getIdUser());
        usersTmp.setUserAlias(user.getUserAlias());
        return usersRepo.save(usersTmp);
    }

    @Override
    public Users getUserById(Long id) {
        Users usersTmp = usersRepo.getById(id);
        return usersTmp;
    }
    @Override
    public Users getUserByAlias(String Alias) {
        Users usersTmp = usersRepo.findByUserAlias(Alias);
        return usersTmp;
    }

    @Override
    public void deleteUserById(Long id) {
        Users usersTmp = usersRepo.getById(id);
        usersRepo.delete(usersTmp);

    }


}
