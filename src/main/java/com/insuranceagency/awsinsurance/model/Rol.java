package com.insuranceagency.awsinsurance.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Rol")
@ToString
@EqualsAndHashCode

public class Rol {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "idRol")
    private Long idRol;

    @Getter @Setter @Column(name = "description")
    private String description;

}
