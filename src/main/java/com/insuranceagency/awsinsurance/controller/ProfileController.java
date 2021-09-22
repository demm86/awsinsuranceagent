package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.impl.ProfileServiceImpl;
import com.insuranceagency.awsinsurance.model.Profile;
import com.insuranceagency.awsinsurance.model.Users;
import com.insuranceagency.awsinsurance.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProfileServiceImpl profileService;

    //@GetMapping(path = "/gusers")
    @RequestMapping(value = "/api/profiles", method = RequestMethod.GET)
    //public List<User> getUsers(@RequestHeader(value="Authorization") String token) {
    public List<Profile> getProfiles() {
        List<Profile> test = profileService.getProfiles();
        test.forEach(System.out::println);
        return test;
    }

}
