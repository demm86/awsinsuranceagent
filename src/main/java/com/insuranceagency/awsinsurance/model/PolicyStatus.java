package com.insuranceagency.awsinsurance.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "SysAdmin")
@ToString @EqualsAndHashCode

public class PolicyStatus {

    @Getter @Setter @Column(name = "idStatus")
    private Long idStatus;

    @Getter @Setter @Column(name = "description")
    private Long description;

}
