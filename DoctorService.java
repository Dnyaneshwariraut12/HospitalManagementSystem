package com.edu.HMS.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.edu.HMS.entity.Doctor;


@Service
public interface DoctorService{
	Doctor saveDoctort(Doctor doctor);
	

	static Doctor getDoctorById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	List<Doctor> getAllDoctor();


	void deleteDoctor(long id);



}
