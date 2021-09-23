package com.insuranceagency.awsinsurance.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
@ToString @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idEmployee")
    private Long idEmployee;

    @Getter @Setter @Column(name = "idRol")
    private Long idRol;

    @Getter @Setter @Column(name = "idUser")
    private Long idUser;

    @Getter @Setter @Column(name = "firstName")
    private String firstName;

    @Getter @Setter @Column(name = "lastName")
    private String lastName;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "phone")
    private String phone;

}
