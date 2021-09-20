package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Agent")
@ToString @EqualsAndHashCode

public class Agent {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idAgent")
    private Long idAgent;

    @Getter @Setter @Column(name = "idEmployees")
    private String idEmployees;

    @Getter @Setter @Column(name = "firstName")
    private String firstName;

    @Getter @Setter @Column(name = "lastName")
    private String lastName;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "phone")
    private String phone;

}
