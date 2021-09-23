package com.insuranceagency.awsinsurance.repository;

import com.insuranceagency.awsinsurance.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Long> {
    Users findByUserAlias (String userAlias);
}
