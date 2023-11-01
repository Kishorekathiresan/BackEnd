package com.example.demo.repositories;


import com.example.demo.entities.Doctor;
import com.example.demo.entities.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
 
import java.util.List;
 
public interface PatientDetailsRepository extends JpaRepository<PatientDetails, Long> {
    List<PatientDetails> findByDoctor(Doctor doctor);
}
