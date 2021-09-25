package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.impl.UserServiceImpl;
import com.insuranceagency.awsinsurance.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;



    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //@GetMapping(path = "/gusers")
    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public List<Users> getUsers() {
        List<Users> test = userService.getUsers();
        test.forEach(System.out::println);
        return test;
    }

    @RequestMapping(value = "/api/users", method = RequestMethod.POST)
    public Users saveUser(@RequestBody Users user) {
        String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userService.saveUser(user);
    }

    @RequestMapping(value = "/api/users", method = RequestMethod.PUT)
    public Users updateUser(@RequestBody Users user) {
        return userService.updateUser(user);
    }


    @RequestMapping(value = "api/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/api/userAlias/{alias}", method = RequestMethod.GET)
    public Users userAlias( @PathVariable String alias) {
       return userService.getUserByAlias(alias);
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public Users userById( @PathVariable long id) {
        return userService.getUserById(id);
    }
}
