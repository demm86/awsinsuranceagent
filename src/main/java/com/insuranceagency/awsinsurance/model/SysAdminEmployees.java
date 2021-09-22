package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "SysAdminEmployees")
@ToString @EqualsAndHashCode

public class SysAdminEmployees {

    @Getter @Setter @Column(name = "idSysAdminEmployee")
    private Long idSysAdminEmployee;

    @Getter @Setter @Column(name = "idSysAdmin")
    private Long idSysAdmin;

    @Getter @Setter @Column(name = "idEmployees")
    private Long idEmployees;

    @Getter @Setter @Column(name = "active")
    private boolean active;
}
