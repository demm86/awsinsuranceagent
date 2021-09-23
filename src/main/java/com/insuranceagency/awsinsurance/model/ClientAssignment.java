package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "ClientAssignments")
@ToString @EqualsAndHashCode

public class ClientAssignment {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idClientAssignments")
    private Long idClientAssignments;

    @Getter @Setter @Column(name = "idClient")
    private Long idClient;

    @Getter @Setter @Column(name = "idAgentEmployee")
    private Long idAgentEmployee;

    @Getter @Setter @Column(name = "active")
    private boolean active;

}
