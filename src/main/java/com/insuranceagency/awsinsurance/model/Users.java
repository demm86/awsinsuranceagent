package com.insuranceagency.awsinsurance.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@ToString @EqualsAndHashCode

public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idUser")
    private Long idUser;

    @Getter @Setter @Column(name = "idProfile")
    private String idProfile;

    @Getter @Setter @Column(name = "userAlias")
    private String userAlias;

    @Getter @Setter @Column(name = "password")
    private String password;

}
