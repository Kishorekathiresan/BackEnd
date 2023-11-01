package com.example.demo.entities;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String fullName; // Added field
    private String specialization; // Added field
    private boolean leaveRequested; // Added field for leave status
 
    // Constructors
    public Doctor() {
    }
 
    public Doctor(String username, String password, String fullName, String specialization) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.specialization = specialization;
    }
 
    // Getters and Setters
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getFullName() {
        return fullName;
    }
 
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
 
    public String getSpecialization() {
        return specialization;
    }
 
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
 
    public boolean isLeaveRequested() {
        return leaveRequested;
    }
 
    public void setLeaveRequested(boolean leaveRequested) {
        this.leaveRequested = leaveRequested;
    }
}