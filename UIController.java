package com.edu.HMS;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.edu.HMS.entity.Doctor;
import com.edu.HMS.entity.Patient;
import com.edu.HMS.service.AdminService;
import com.edu.HMS.service.DoctorService;
import com.edu.HMS.service.PatientService;



public class UIController {
	private PatientService patientService;
	private DoctorService doctorService;
	private AdminService adminService;
	@Autowired	
public UIController( PatientService  patientService, DoctorService doctorService,
			AdminService adminService) {
		super();
		this.patientService =  patientService;
		this.doctorService = doctorService;
		this.adminService = adminService;
	}

@GetMapping("/")
	
	String index() {
		return "index";/// index.html
	}

// Employee 
@GetMapping("/registration")
public String patientRegistrationForm(Model model) {
	Patient patient = new Patient();
	model.addAttribute("patient", patient);
    return "add-patient";
}

@PostMapping("/savePatient")
public String savePatient(@Validated  Patient patient, Errors errors, Model model) {
	if(null != errors && errors.getErrorCount() > 0)
		return "redirect:/";
	else {
    patientService.savePatient(patient);
	List<Patient> patients =  patientService.getAllPatient();
    model.addAttribute("successMessage", "Details are saved successfully");
	}
    return "redirect:/getPatient";
    
}

@GetMapping("/getPatient")
public String getAllPatient(Model model) {
	
	List<Patient> patient =  patientService.getAllPatient();
	
	model.addAttribute("patient", patient);
	
    return "list-patient";
    }


// Department 

@GetMapping("/doctorRegister")
public String doctorRegistrationForm(Model model) {
	Doctor doctor = new Doctor();
	model.addAttribute("doctor", doctor);
    return "add-doctor";
}

@PostMapping("/saveDoctor")
public String addDoctor(@Validated  Doctor doctor, Errors errors, Model model) {
	if(null != errors && errors.getErrorCount() > 0)
		return "add-doctor";
	else {
    doctorService.saveDoctort(doctor);
    model.addAttribute("successMessage", "Details are saved successfully");
	}
    return "list-doctor";
}
    @GetMapping("/getDoctor")
    public String getAllDoctor(Model model, Object doctor) {
    	
    	List<Doctor> doctors =  doctorService.getAllDoctor();
    	
    	model.addAttribute("doctor", doctor);
    	
        return "list-doctor";
        }
   
}




