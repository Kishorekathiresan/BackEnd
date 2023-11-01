package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Receptionist;
import com.example.demo.repository.ReceptionistRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class ReceptionistLoginController {
    @Autowired
    private ReceptionistRepository receptionistRepository;

    @GetMapping("/receptionistlogin")
    public String loginPage() {
        return "receptionistlogin"; // Assuming you have a JSP file for receptionist login
    }

    @GetMapping("/welcomereceptionist")
    public String dashboardPage() {
        return "welcomereceptionist"; // Assuming you have a JSP file for the receptionist's dashboard
    }

    @PostMapping("/receptionistlogin")
    public String login(@RequestParam String user, @RequestParam String pass, HttpSession session) {
        Receptionist receptionistFromDB = receptionistRepository.findByUsernameAndPassword(user, pass);

        if (receptionistFromDB != null) {
            // Authentication successful
            session.setAttribute("loggedInReceptionist", receptionistFromDB);
            return "redirect:/welcomereceptionist"; // Redirect to the receptionist's dashboard page
        } else {
            // Authentication failed
            return "redirect:/error";// receptionist login page with an error message
        }
    }
}

