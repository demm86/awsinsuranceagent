package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.impl.UserServiceImpl;
import com.insuranceagency.awsinsurance.model.Users;
import com.insuranceagency.awsinsurance.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private JWTUtil jwtUtil;

    //@GetMapping(path = "/gusers")
    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    //public List<User> getUsers(@RequestHeader(value="Authorization") String token) {
    public List<Users> getUsers() {

        //if (!validarToken(token)) { return null; }
        List<Users> test = userService.getUsers();
        test.forEach(System.out::println);
        return test;
    }

    @GetMapping(path = "/user")
    public String helloWorld() {
        String token = jwtUtil.create("dmontes","dmontes");
        return "Hello World - ints"+ token;
    }
    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }

    @RequestMapping(value = "api/users", method = RequestMethod.POST)
    public void saveUser(@RequestBody Users user) {

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, user.getPassword());
        user.setPassword(hash);

        userService.saveUser(user);
    }

    @RequestMapping(value = "api/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@RequestHeader(value="Authorization") String token,
                         @PathVariable Long id) {
        if (!validarToken(token)) { return; }
        userService.deleteUserById(id);
    }
}
