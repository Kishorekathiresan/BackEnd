package com.example.demo.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;
 
@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
 
    public void registerDoctor(String username, String password) {
        Doctor doctor = new Doctor();
        doctor.setUsername(username);
        doctor.setPassword(password);
        doctorRepository.save(doctor);
    }
 
    public Doctor findDoctorByUsernameAndPassword(String username,String password) {
        return doctorRepository.findByUsernameAndPassword(username,password);
    }
}