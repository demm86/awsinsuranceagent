package com.insuranceagency.awsinsurance.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "policyStatus")
@ToString @EqualsAndHashCode
@NoArgsConstructor
public class PolicyStatus {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idStatus")
    private Long idStatus;

    @Getter @Setter @Column(name = "description")
    private String description;

}
