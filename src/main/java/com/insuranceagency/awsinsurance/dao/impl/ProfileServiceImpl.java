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
        Profile profileTmp = entityManager.merge(profile);
        return profileTmp;
    }

    @Override
    public Profile updateProfile(Profile profile) {
        Profile profileTmp = entityManager.find(Profile.class,profile.getIdProfile());
        profileTmp.setDescription(profile.getDescription());
        return entityManager.merge(profile);
    }

    @Override
    public Profile getProfileById(Long id) {
        return entityManager.find(Profile.class,id);
    }

    @Override
    public List<Profile>  getProfileByDescription(String description) {
        String query ="From Profile where description = :description";
        try {
            List<Profile> list = entityManager.createQuery(query).setParameter("description", description).getResultList();
            return list;
        }
        catch(Exception e) {
         return  null;
        }

    }

    @Override
    public void deleteProfileById(Long id) {
        Profile profile = entityManager.find(Profile.class,id);
        entityManager.remove(profile);
    }
}
