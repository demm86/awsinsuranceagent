package com.insuranceagency.awsinsurance.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "AgentAssignments")
@ToString @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
