package com.edu.HMS.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="doctorTb2")
public class Doctor {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column	
private Long id;
	
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="specilisation")
	private String speciliasation;
	private String password;
	@Column
	private String role;
	
	@Column
	private boolean active;
	
	public Long getId() {
		return id;
	}
	
	@OneToMany(mappedBy="doctor")
	private List<Patient>patient;
	
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
	public String getSpeciliasation() {
		return speciliasation;
	}
	public void setSpeciliasation(String speciliasation) {
		this.speciliasation = speciliasation;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Doctor(Long id, String firstName, String lastName, String speciliasation, String password, String role,
			boolean active, List<Patient> patient) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.speciliasation = speciliasation;
		this.password = password;
		this.role = role;
		this.active = active;
		this.patient = patient;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
