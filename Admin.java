package com.edu.HMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

public class Admin {
	@Data
	@Entity
	@Table(name="admin")
	public class Patient {
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		@Column
		private Long id;
		
		@Column(name="first_name")
		private String firstName;
		@Column(name="last_name")
		private String lastName;
}
	
}