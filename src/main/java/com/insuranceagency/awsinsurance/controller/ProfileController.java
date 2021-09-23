package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.impl.ProfileServiceImpl;
import com.insuranceagency.awsinsurance.model.Profile;
import com.insuranceagency.awsinsurance.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProfileServiceImpl profileService;

    @RequestMapping(value = "/api/profiles", method = RequestMethod.GET)
    public List<Profile> getProfiles() {
        List<Profile> test = profileService.getProfiles();
        test.forEach(System.out::println);
        return test;
    }
    @RequestMapping(value = "/api/profile/description/{description}", method = RequestMethod.GET)
    public List<Profile> profileAlias( @PathVariable String description) {
        return profileService.getProfileByDescription(description);
    }
    @RequestMapping(value = "/api/profile/id/{id}", method = RequestMethod.GET)
    public Profile profileId( @PathVariable Long id) {
        return profileService.getProfileById(id);
    }

    @RequestMapping(value = "/api/profile/info", method = RequestMethod.POST)
    public String helloWorld(@RequestBody Profile profile) {
        return "Hello World - ints"+ profile.getDescription();
    }

    @RequestMapping(value = "/api/profile", method = RequestMethod.POST)
    public Profile saveProfile(@RequestBody Profile profile) {
        return profileService.saveProfile(profile);
    }

    @RequestMapping(value = "/api/profile", method = RequestMethod.PUT)
    public Profile updateProfile(@RequestBody Profile profile) {
        return profileService.updateProfile(profile);
    }

    @RequestMapping(value = "api/profile/{id}", method = RequestMethod.DELETE)
    public void deleteProfile(@PathVariable Long id) {
        profileService.deleteProfileById(id);
    }




}
