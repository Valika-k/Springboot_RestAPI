package com.zee.zee5app.repository;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zee.zee5app.dto.Register;

@Repository
public interface UserRepository extends JpaRepository<Register, String> {

	Boolean existsByEmailAndContactNumber(String email,BigDecimal contactNumber);
	
}