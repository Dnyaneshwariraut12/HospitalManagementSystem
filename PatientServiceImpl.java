package com.edu.HMS.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.HMS.entity.Patient;
import com.edu.HMS.repository.PatientRepository;
import com.edu.HMS.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
private PatientRepository  patientRepository;


	public PatientServiceImpl( PatientRepository  patientRepository ) {
	super();
	this.patientRepository = patientRepository;
	// TODO Auto-generated constructor stub
}


	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> getAllPatient() {
	return patientRepository.findAll();
				
	}


	@Override
	public List<Patient> getPatientByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Patient> getPatientByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
