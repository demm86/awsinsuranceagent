package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "AgentAssignments")
@ToString @EqualsAndHashCode

public class AgentAssignment {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idAgentAssigments")
    private Long idAgentAssignments;

    @Getter @Setter @Column(name = "idEmployeeManager")
    private Long idEmployees;

    @Getter @Setter @Column(name = "idAgent")
    private Long idAgent;

    @Getter @Setter @Column(name = "active")
    private boolean isActive;

}
