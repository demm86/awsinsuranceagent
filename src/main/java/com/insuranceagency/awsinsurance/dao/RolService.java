package com.insuranceagency.awsinsurance.dao;

import com.insuranceagency.awsinsurance.model.Employee;
import com.insuranceagency.awsinsurance.model.Rol;

import java.util.List;

public interface RolService {

    List<Rol> getRol();

    Rol saveRol(Rol rol);
    Rol updateRol(Rol rol);
    Rol getRolById(Long id);
    Rol deleteRol(Long id);
}
