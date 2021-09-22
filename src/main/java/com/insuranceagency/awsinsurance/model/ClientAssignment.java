package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "ClientAssignment")
@ToString @EqualsAndHashCode

public class ClientAssignment {

    @Getter @Setter @Column(name = "idClientAssignments")
    private Long idClientAssignments;

    @Getter @Setter @Column(name = "idClient")
    private Long idClient;

    @Getter @Setter @Column(name = "idAgent")
    private Long idAgent;

    @Getter @Setter @Column(name = "active")
    private boolean active;

}
