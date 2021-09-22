package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "Dependent")
@ToString @EqualsAndHashCode

public class Dependent {

    @Getter @Setter @Column(name = "idDependent")
    private Long idDependent;

    @Getter @Setter @Column(name = "idInsurancePolicy")
    private Long idInsurancePolicy;

    @Getter @Setter @Column(name = "firstName")
    private String firstName;

    @Getter @Setter @Column(name = "lastName")
    private String lastName;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "phone")
    private String phone;

    @Getter @Setter @Column(name = "birthday")
    private SimpleDateFormat birthday;

}
