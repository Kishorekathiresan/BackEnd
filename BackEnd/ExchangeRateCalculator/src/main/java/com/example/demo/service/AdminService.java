package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.entities.AdminDetails;
import com.example.demo.repositories.AdminRepository;
 
@Service
public class AdminService {
    @Autowired
    AdminRepository AdminRepository;
 
    public void registerUser(String username, String password) {
        AdminDetails admin = new AdminDetails();
        admin.setUsername(username);
        admin.setPassword(password);
        AdminRepository.save(admin);
    }
 
    public AdminDetails findByUsernameAndPassword(String username,String password) {
        return AdminRepository.findByUsernameAndPassword(username,password);
    }
}