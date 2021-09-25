package com.insuranceagency.awsinsurance.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@ToString @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idUser", updatable = false, nullable = false)
    private Long idUser;

    @Getter @Setter @Column(name = "idProfile")
    private String idProfile;

    @Getter @Setter @Column(name = "userAlias")
    private String userAlias;

    @Getter @Setter @Column(name = "password")
    private String password;

}
