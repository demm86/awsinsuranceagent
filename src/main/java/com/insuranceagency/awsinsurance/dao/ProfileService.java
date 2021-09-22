package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Profile;

import java.util.List;

public interface ProfileService {

    List<Profile> getProfiles();

    Profile saveProfile(Profile profile);
    Profile updateProfile(Profile profile);
    Profile getProfileById(Long id);
    void deleteProfileById(Long id);
}
