package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Users;

import java.util.List;

public interface UserService {

    List<Users> getUsers();

    Users saveUser(Users user);
    Users updateUser(Users user);
    Users getUserById(Long id);
    void deleteUserById(Long id);


}
