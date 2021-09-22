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
    //TODO ask about period type
    //@Getter @Setter @Column(name = "period")
    //private ? period;
    //TODO ask about value type
    //@Getter @Setter @Column(name = "value")
    //private ? value;
    //TODO ask about deductible type
    //@Getter @Setter @Column(name = "deductible")
    //private ? deductible;
    //TODO ask about coverageAmount type
    //@Getter @Setter @Column(name = "coverageAmount")
    //private ? coverageAmount;

    @Getter @Setter @Column(name = "coverageStartDate")
    private SimpleDateFormat coverageStartDate;
    //TODO ask about coveragePeriod type
    //@Getter @Setter @Column(name = "coveragePeriod")
    //private ? coveragePeriod;
    //TODO ask about monthlyFee Type
    //@Getter @Setter @Column(name = "monthlyFee")
    //private ? monthlyFee;
    //TODO ask about commission type
    //@Getter @Setter @Column(name = "commission")
    //private ? commission;

    @Getter @Setter @Column(name = "active")
    private boolean active;


}
