package com.edu.HMS.service;

import java.util.List;

import com.edu.HMS.entity.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);

	List<Admin> getAllAdmin();

	void deleteAdmin(long id);

}
