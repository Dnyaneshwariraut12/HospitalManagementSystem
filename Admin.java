package com.edu.HMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="admin")
public class Admin {
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		@Column
		private Long id;
		
		@Column(name="first_name")
		private String firstName;
		@Column(name="last_name")
		private String lastName;
		@Column
		private String password;
		@Column
		private String role;
		
		
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

	

		public Admin(Long id, String firstName, String lastName, String password, String role, boolean active) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.password = password;
			this.role = role;
			
		}
		
		 
}
	
