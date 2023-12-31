package com.example.demo.controller;
 
import com.example.demo.entities.Doctor;
import com.example.demo.entities.PatientDetails;
import com.example.demo.service.DoctorService;
import com.example.demo.repositories.DoctorRepository;
import com.example.demo.repositories.PatientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;
import java.util.List;
@Controller
public class DoctorController {
 
    @Autowired
    private DoctorRepository doctorRepository;
    
    @Autowired
    private DoctorService doctorService;
 
    @Autowired
    private PatientDetailsRepository patientDetailsRepository;
 
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Assuming you have a JSP file named "login.jsp" for doctor login
    }
 
    @GetMapping("/doctor/dashboard")
    public String displayDoctorDashboard(Model model, HttpSession session) {
        Doctor loggedInDoctor = (Doctor) session.getAttribute("loggedInDoctor");
        if (loggedInDoctor != null) {
            // Get patient details for the logged-in doctor
            List<PatientDetails> patients = patientDetailsRepository.findByDoctor(loggedInDoctor);
            model.addAttribute("patients", patients);
            model.addAttribute("loggedInDoctor", loggedInDoctor);
            return "dashboard"; // Assuming your JSP file is named "DoctorDashboard.jsp"
        } else {
            return "redirect:/login"; // Redirect to the login page if not logged in
        }
    }
 
    @PostMapping("/login")
    public String login(@RequestParam String user, @RequestParam String pass, HttpSession session) {
        Doctor doctorFromDB = doctorRepository.findByUsernameAndPassword(user, pass);
 
        if (doctorFromDB != null) {
            // Authentication successful
            session.setAttribute("loggedInDoctor", doctorFromDB);
            return "redirect:/doctor/dashboard"; // Redirect to the doctor's dashboard page
        } else {
            // Authentication failed
            return "redirect:/error"; // Doctor login page with an error message
        }
    }
 
    @PostMapping("/doctor/request-leave")
    public String requestLeave(HttpSession session) {
        Doctor loggedInDoctor = (Doctor) session.getAttribute("loggedInDoctor");
        if (loggedInDoctor != null) {
            // Add logic to request leave here
            doctorService.requestLeave(loggedInDoctor);
        }
        return "redirect:/doctor/dashboard";
    }
 
    @PostMapping("/doctor/cancel-leave")
    public String cancelLeave(HttpSession session) {
        Doctor loggedInDoctor = (Doctor) session.getAttribute("loggedInDoctor");
        if (loggedInDoctor != null) {
            // Add logic to cancel leave here
            doctorService.cancelLeave(loggedInDoctor);
        }
        return "redirect:/doctor/dashboard";
    }
 
    // Add other methods as needed
}