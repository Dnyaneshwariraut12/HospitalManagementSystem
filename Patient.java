package com.edu.HMS.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name="patientTbl")
public class Patient {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="age")
	private int age;
	@Column(name="weight")
	private int weight;
	@Column(name="gender")
	private String gender;
	@Column(name="moblie_no")
	private int mobileNo;
	@Column(name="address")
	private String address;
	@Column(name="disease")
	private String disease;
	@Column(name="doctor_id")
	private String doctorId;
	
	@Transient
	private int count;

	public Patient(Long id, String firstName, String lastName, String email, int age, int weight, String gender,
			int mobileNo, String address, String disease, String doctorId, int count) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.address = address;
		this.disease = disease;
		this.doctorId = doctorId;
		this.count = count;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
