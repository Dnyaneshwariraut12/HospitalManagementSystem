package com.edu.HMS.service;

import java.util.List;

import com.edu.HMS.entity.Patient;

public interface PatientService {

	Patient savePatient(Patient patient);

	List<Patient> getAllPatient();


		
	List<Patient> getPatientByFirstName(String firstName);

	List<Patient> getPatientByFirstNameAndLastName(String firstName, String lastName);

	void deletePatient(long id);

	List<Patient> getPatientByFirstNameOrLastName(String firstName, String lastName);

	static Patient getPatientById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
