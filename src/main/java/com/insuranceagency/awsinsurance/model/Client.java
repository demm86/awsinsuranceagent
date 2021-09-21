package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "Client")
@ToString @EqualsAndHashCode

public class Client {

    @Getter @Setter @Column(name = "idClient")
    private Long idClient;

    @Getter @Setter @Column(name = "idEmployee")
    private Long idEmployee;

    @Getter @Setter @Column(name = "firstName")
    private String firstName;

    @Getter @Setter @Column(name = "lastName")
    private String lastName;

    @Getter @Setter @Column(name = "address")
    private String address;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "phone")
    private String phone;

    @Getter @Setter @Column(name = "birthday")
    private SimpleDateFormat birthday;
}


