package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "InsurancePolicy")
@ToString @EqualsAndHashCode

public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idInsurancePolicy")
    private Long idInsurancePolicy;

    @Getter @Setter @Column(name = "idClient")
    private Long idClient;

    @Getter @Setter @Column(name = "sellIDAgent")
    private Long sellIDAgent;

    @Getter @Setter @Column(name = "idType")
    private Long idType;

    @Getter @Setter @Column(name = "idStatus")
    private Long idStatus;

    @Getter @Setter @Column(name = "period")
    private int period;

    @Getter @Setter @Column(name = "value")
    private double value;

    @Getter @Setter @Column(name = "deductible")
    private double deductible;

    @Getter @Setter @Column(name = "coverageAmount")
    private double coverageAmount;

    @Getter @Setter @Column(name = "coverageStartDate")
    private SimpleDateFormat coverageStartDate;

    @Getter @Setter @Column(name = "coveragePeriod")
    private int coveragePeriod;

    @Getter @Setter @Column(name = "monthlyFee")
    private double monthlyFee;

    @Getter @Setter @Column(name = "commission")
    private double commission;

    @Getter @Setter @Column(name = "active")
    private boolean active;


}
