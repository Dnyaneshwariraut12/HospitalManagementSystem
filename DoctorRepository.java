package com.edu.HMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.edu.HMS.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long>{
	List<Doctor> findByFirstName(String firstName);

	List<Doctor> findByLastName(String lastName);

	@Query("select d from Doctor d where d.firstName = :name ")//JPQL
    List<Doctor> findDoctorByFirstName(@Param("name") String firstName);//john

}
