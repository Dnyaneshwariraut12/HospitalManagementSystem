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
	public Doctor(Long id, String firstName, String lastName, String speciliasation) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.speciliasation = speciliasation;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
