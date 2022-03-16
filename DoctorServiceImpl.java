package com.edu.HMS.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.HMS.entity.Doctor;

import com.edu.HMS.repository.DoctorRepository;

public class DoctorServiceImpl {
	
	@Autowired
private DoctorRepository  doctorRepository;

	public DoctorServiceImpl( DoctorRepository  doctorRepository) {
		super();
		this. doctorRepository= doctorRepository;
		// TODO Auto-generated constructor stub
	}
	
	public List<Doctor> getAllDoctor() {
	return doctorRepository.findAll();
	}
				
	
}
