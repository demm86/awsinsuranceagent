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

    @Getter @Setter @Column(name = "idType")
    private Long idType;

    @Getter @Setter @Column(name = "description")
    private String description;
    //TODO put values to these variables later
    //@Getter @Setter @Column(name = "period")
    //private void period;

    //@Getter @Setter @Column(name = "value")
    //private ? value;

    //@Getter @Setter @Column(name = "allowDependent")
    //private ? allowDependent;

    //@Getter @Setter @Column(name = "maxDependent")
    //private ? maxDependent;

    //@Getter @Setter @Column(name = "commission")
    //private ? commission;

}
