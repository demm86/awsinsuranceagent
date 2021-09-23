package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.impl.UserServiceImpl;
import com.insuranceagency.awsinsurance.model.Users;
import com.insuranceagency.awsinsurance.utils.JwtUtil;
import com.insuranceagency.awsinsurance.utils.WebSecurityConfig;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
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
    private JwtUtil jwtUtil;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    //@GetMapping(path = "/gusers")
    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public List<Users> getUsers() {

        List<Users> test = userService.getUsers();
        test.forEach(System.out::println);
        return test;
    }

    @RequestMapping(value = "/api/info", method = RequestMethod.POST)
    public String helloWorld(@RequestBody Users user) {
        String token = jwtUtil.create("dmontes","dmontes");
        return "Hello World - ints"+ token;
    }
    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }

    @RequestMapping(value = "/api/users", method = RequestMethod.POST)
    public Users saveUser(@RequestBody Users user) {


        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, user.getPassword());


        String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());


        user.setPassword(encodedPassword);

        return userService.saveUser(user);
    }

    @RequestMapping(value = "api/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@RequestHeader(value="Authorization") String token,
                         @PathVariable Long id) {
        if (!validarToken(token)) { return; }
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/api/userAlias/{alias}", method = RequestMethod.GET)
    public Users userAlias( @PathVariable String alias) {
       return userService.getUserByAlias(alias);
    }
}
