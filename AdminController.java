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

import com.edu.HMS.entity.Admin;
import com.edu.HMS.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
    @Autowired
	private AdminService adminService;


    public AdminController(AdminService adminService) {
   		super();
   		this.adminService =adminService;
   	}
    @PostMapping
    public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<Admin>(adminService.saveAdmin(admin),HttpStatus.CREATED);
	}
    @GetMapping
	public List<Admin> getAllAdmin()
	{
		return adminService.getAllAdmin();
	}
    @DeleteMapping("{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable("id") long id){
		adminService.deleteAdmin(id);
		return new ResponseEntity<String>("Admin record deleted ",HttpStatus.OK);
	}
}
 