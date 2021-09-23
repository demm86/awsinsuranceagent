package com.insuranceagency.awsinsurance.model;

import lombok.*;

import javax.persistence.*;
@Table(name = "Profile")
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Profile {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idProfile")
    private Long idProfile;

    @Getter @Setter @Column(name = "description")
    private String description;

}
