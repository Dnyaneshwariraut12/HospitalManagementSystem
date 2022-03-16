package com.edu.HMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.edu.HMS.entity.Doctor;
import com.edu.HMS.entity.Patient;

public interface DoctorRepository extends JpaRepository<Doctor,Long>{
	List<Doctor> findByFirstName(String firstName);

	List<Doctor> findByLastName(String lastName);

	@Query("select p from Patient p where p.firstName = :name ")//JPQL
    List<Patient> findEmployeesByFirstName(@Param("name") String firstName);//john

}
