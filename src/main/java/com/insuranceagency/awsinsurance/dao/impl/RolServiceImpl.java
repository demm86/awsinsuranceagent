package com.insuranceagency.awsinsurance.dao.impl;

import com.insuranceagency.awsinsurance.dao.RolService;
import com.insuranceagency.awsinsurance.model.Rol;
import com.insuranceagency.awsinsurance.repository.RolRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RolServiceImpl implements RolService {

    @PersistenceContext
    EntityManager entityManager;

    private final RolRepository rolRepository;

    @Override
    public List<Rol> getRol() {
        String query = "FROM Rol";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Rol saveRol(Rol rol) {
        try{
            return rolRepository.save(rol);
        }
        catch(Exception e) {
            throw e;
        }
    }

    @Override
    public Rol updateRol(Rol rol) {
        return null;
    }

    @Override
    public Rol getRolById(Long id) {
        return null;
    }

    @Override
    public Rol deleteRol(Long id) {

    }

}
