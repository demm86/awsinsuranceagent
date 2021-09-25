package com.insuranceagency.awsinsurance.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "InsurancePolicy")
@ToString @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idInsurancePolicy")
    private Long idInsurancePolicy;

    @Getter @Setter @Column(name = "idClient")
    private Long idClient;

    @Getter @Setter @Column(name = "sellIdAgent")
    private Long sellIdAgent;

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
    private Date coverageStartDate;

    @Getter @Setter @Column(name = "coveragePerior")
    private int coveragePerior;

    @Getter @Setter @Column(name = "monthlyFee")
    private double monthlyFee;

    @Getter @Setter @Column(name = "comission")
    private double comission;

    @Getter @Setter @Column(name = "active")
    private boolean active;


}
