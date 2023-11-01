package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



import com.example.demo.entities.Patient;
import com.example.demo.service.PatientService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PatientController {
    @Autowired
    private PatientService patientService;
    
    @GetMapping("/welcome")
    public String welcomepatient() {
    	return "welcome";
    }

    @GetMapping("/patientregistration")
    public String patientRegistrationPage() {
        return "patientregistration";
    }

    @PostMapping("/patientregistration")
    public String registerPatient(@RequestParam String username, @RequestParam String password,HttpServletRequest request) {
        Patient patient = patientService.registerPatient(username, password);

        if (patient == null) {
            // Handle the case where registration failed (e.g., username already in use)
        	request.setAttribute("error", "Invalid login. Please try again.");
        	return "redirect:/patientregistration"; // Redirect back to registration page with an error message
        }
        else {

        // Redirect to the patient's dashboard or another page
        return "redirect:/welcome";
    }}

    @GetMapping("/patientlogin")
    public String patientLoginPage() {
        return "patientlogin";
    }

    @PostMapping("/patientlogin")
    public String loginPatient(@RequestParam String username, @RequestParam String password,HttpServletRequest request) {
        Patient patient = patientService.loginPatient(username, password);

        if (patient == null) {
            // Handle the case where login failed (e.g., invalid credentials)
        	request.setAttribute("error", "Invalid registration. Please try again.");

        	return "redirect:/patientlogin"; // Redirect back to login page with an error message
        }
        else {

        // Redirect to the patient's dashboard or another page
        return "redirect:/welcome";
    }}
}
