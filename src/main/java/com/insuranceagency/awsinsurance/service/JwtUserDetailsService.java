package com.insuranceagency.awsinsurance.service;

import java.util.ArrayList;

import com.insuranceagency.awsinsurance.dao.impl.UserServiceImpl;
import com.insuranceagency.awsinsurance.model.Users;
import com.insuranceagency.awsinsurance.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    UsersRepo usersRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = usersRepo.findByUserAlias(username);

        if (user.getUserAlias().equals(username)) {

            return new User(user.getUserAlias(), user.getPassword(),
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}