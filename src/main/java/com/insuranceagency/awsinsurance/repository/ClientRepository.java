package com.insuranceagency.awsinsurance.repository;

import com.insuranceagency.awsinsurance.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
