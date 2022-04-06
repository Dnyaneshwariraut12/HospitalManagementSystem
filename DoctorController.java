package com.edu.HMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.HMS.entity.Doctor;
import com.edu.HMS.service.DoctorService;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
	
 public DoctorController( DoctorService  doctorService) {
		super();
		this. doctorService = doctorService;
	
	}
 @PostMapping
	// savePatient(Patient obj)
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor) {
		return new ResponseEntity<Doctor>(doctorService.saveDoctort(doctor),HttpStatus.CREATED);
	}

	@GetMapping
	public <doctorService> List<Doctor> getAllDoctor(){
		return doctorService.getAllDoctor();
	}
	@GetMapping("{id}")//4
	public ResponseEntity<Doctor>getDoctorById(@PathVariable("id") long id) {
		return new ResponseEntity<Doctor>(DoctorService.getDoctorById(id), HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDoctor(@PathVariable("id") long id){
		doctorService.deleteDoctor(id);
		return new ResponseEntity<String>("Doctor record deleted ",HttpStatus.OK);
	}

}
