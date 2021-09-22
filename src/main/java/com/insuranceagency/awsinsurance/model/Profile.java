package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Profile")
@ToString @EqualsAndHashCode

public class Profile {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idProfile")
    private Long idProfile;

    @Getter @Setter @Column(name = "description")
    private String description;

}
