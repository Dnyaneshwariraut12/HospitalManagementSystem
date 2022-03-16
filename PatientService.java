package com.edu.HMS.service;

import java.util.List;

import com.edu.HMS.entity.Patient;

public interface PatientService {

	Patient savePatient(Patient patient);

	List<Patient> getAllPatient();

	static Patient getPatientById(List<Long> id) {
		// TODO Auto-generated method stub
		return null;
	}

	List<Patient> getPatientByFirstName(String firstName);

	List<Patient> getPatientByFirstNameAndLastName(String firstName, String lastName);


	@Override
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
		
	}

	static Patient getPatientById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
