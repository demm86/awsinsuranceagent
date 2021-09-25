package com.insuranceagency.awsinsurance.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PolicyType")
@ToString @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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

    @Getter @Setter @Column(name = "comission")
    private double comission;

}
