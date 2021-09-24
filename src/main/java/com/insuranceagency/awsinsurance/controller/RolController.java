package com.insuranceagency.awsinsurance.controller;

import com.insuranceagency.awsinsurance.dao.RolService;
import com.insuranceagency.awsinsurance.model.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolController {

    @Autowired
    private RolService rolService;

    @RequestMapping(value = "api/rol", method = RequestMethod.GET)
    public List<Rol> getRol() {
        List<Rol> test = rolService.getRol();
        return test;
    }

    @RequestMapping(value = "api/rol", method = RequestMethod.POST)
    public Rol rol(@RequestBody Rol rol){
        return rolService.saveRol(rol);
    }

    @RequestMapping(value = "/api/rol", method = RequestMethod.PUT)
    public Rol updateRol(@RequestBody Rol rol) {
        return rolService.updateRol(rol);
    }

    @RequestMapping(value = "api/rol/{id}", method = RequestMethod.DELETE)
    public void deleteRol(@PathVariable Long id) {
        rolService.deleteRol(id);
    }

}
