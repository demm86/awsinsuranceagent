package com.insuranceagency.awsinsurance.repository;

import com.insuranceagency.awsinsurance.model.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependentRepository extends JpaRepository<Dependent, Long> {
}
