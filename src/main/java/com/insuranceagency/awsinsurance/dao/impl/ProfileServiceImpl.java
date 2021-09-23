package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.ProfileService;
import com.insuranceagency.awsinsurance.model.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ProfileServiceImpl implements ProfileService {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Profile> getProfiles() {
        String query = "FROM Profile";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Profile saveProfile(Profile profile) {
        return null;
    }

    @Override
    public Profile updateProfile(Profile profile) {
        return null;
    }

    @Override
    public Profile getProfileById(Long id) {
        return null;
    }

    @Override
    public void deleteProfileById(Long id) {

    }
}
