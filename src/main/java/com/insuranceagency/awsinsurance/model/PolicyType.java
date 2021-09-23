package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "PolicyType")
@ToString @EqualsAndHashCode

public class PolicyType {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idType")
    private Long idType;

    @Getter @Setter @Column(name = "description")
    private String description;

    @Getter @Setter @Column(name = "period")
    private int period;

    @Getter @Setter @Column(name = "value")
    private double value;

    @Getter @Setter @Column(name = "allowDependent")
    private boolean allowDependent;

    @Getter @Setter @Column(name = "maxDependent")
    private int maxDependent;

    @Getter @Setter @Column(name = "commission")
    private double commission;

}
