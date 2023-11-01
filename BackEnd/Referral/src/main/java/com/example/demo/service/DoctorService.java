package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.entities.Doctor;
import com.example.demo.entities.PatientDetails; // Import PatientDetails
import com.example.demo.repositories.DoctorRepository;
import com.example.demo.repositories.PatientDetailsRepository; // Import PatientDetailsRepository
 
import java.util.List;
@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    
    @Autowired
    private PatientDetailsRepository patientDetailsRepository;
 
    public void registerDoctor(String username, String password) {
        Doctor doctor = new Doctor();
        doctor.setUsername(username);
        doctor.setPassword(password);
        doctorRepository.save(doctor);
    }
 
    public Doctor findDoctorByUsernameAndPassword(String username, String password) {
        return doctorRepository.findByUsernameAndPassword(username, password);
    }
 
    // Get patient details assigned to the doctor
    public List<PatientDetails> getPatientsForDoctor(Doctor doctor) {
        return patientDetailsRepository.findByDoctor(doctor);
    }
 
    public void requestLeave(Doctor doctor) {
        // Add logic to request leave here, e.g., set a leave flag in the doctor's entity
        doctor.setLeaveRequested(true);
        doctorRepository.save(doctor);
    }
 
    public void cancelLeave(Doctor doctor) {
        // Add logic to cancel leave here, e.g., unset the leave flag in the doctor's entity
        doctor.setLeaveRequested(false);
        doctorRepository.save(doctor);
    }
}
 