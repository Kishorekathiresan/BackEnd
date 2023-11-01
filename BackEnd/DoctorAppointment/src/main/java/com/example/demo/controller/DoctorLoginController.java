package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

import jakarta.servlet.http.HttpSession;

@Controller

public class DoctorLoginController {
    @Autowired
    private DoctorRepository doctorRepository;
 
    @GetMapping("/doctorlogin")
    public String loginPage() {
        return "doctorlogin";//uming you have a JSP file named "login.jsp" for doctor login
    }
 
    @GetMapping("/welcomedoctor")
    public String dashboardPage() {
        return "welcomedoctor"; // Assuming you have a JSP file for the doctor's dashboard
    }
 
    @PostMapping("/doctorlogin")
    public String login(@RequestParam String user, @RequestParam String pass, HttpSession session) {
        Doctor doctorFromDB = doctorRepository.findByUsernameAndPassword(user,pass);
 
        if (doctorFromDB != null ) {
            // Authentication successful
            session.setAttribute("loggedInDoctor", doctorFromDB);
            return "redirect:/welcomedoctor"; // Redirect to the doctor's dashboard page
        } else {
            // Authentication failed
            return "redirect:/error";// doctor login page with an error message
        }
    }
}