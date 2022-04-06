package com.edu.HMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.HMS.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

	List<Patient> findByFirstName(String firstName);//john
	List<Patient> findByLastName(String lastName);
    List<Patient> findByFirstNameOrLastName(String firstName ,String lastName);
}
