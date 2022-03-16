package com.edu.HMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.HMS.entity.Patient;
import com.edu.HMS.service.PatientService;

@RestController
@RequestMapping("/api/patient")// url
public class PatientController {
	@Autowired
	private PatientService patientService;

	
 public PatientController(PatientService patientService) {
		super();
		this.patientService =patientService;
	}

	@PostMapping
	// savePatient(Patient obj)
	public ResponseEntity<Patient> saveEmployee(@RequestBody Patient patient) {
		return new ResponseEntity<Patient>(patientService.savePatient(patient),HttpStatus.CREATED);
	}

	@GetMapping
	public List<Patient> getAllPatient()
	{
		return patientService.getAllPatient();
	}

	@GetMapping("{id}")//4
	public ResponseEntity<Patient>getPatientById(@PathVariable("id") long id) {
		return new ResponseEntity<Patient>(PatientService.getPatientById(id), HttpStatus.OK);
	}
	
	@GetMapping("/patientByFirstName/{firstName}")//john
	public List<Patient> getPatientByFirstName(@PathVariable("firstName")String firstName){
		return patientService.getPatientByFirstName(firstName);//john
	}
	@GetMapping("/patientByFirstNameAndLastName")
	public List<Patient> getPatientByFirstNameAndLastName(@RequestParam("firstName") String firstName, @RequestParam("lastName")  String lastName )
	{
		return patientService.getPatientByFirstNameAndLastName(firstName, lastName);
		
	}

	@GetMapping("/employeeByIds")
	public List<Patient> getPatientByIds(@RequestParam(value="id") List<Long> id){
		return (List<Patient>) PatientService.getPatientById(id);
	}
}
