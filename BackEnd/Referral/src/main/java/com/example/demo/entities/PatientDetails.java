package com.example.demo.entities;
 
import java.time.LocalDate;
import java.time.LocalTime;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "patientdetails")
public class PatientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String patientName;
    private String patientInfo;
 
    // Additional patient details
    private int age;
    private String address;
    private String phoneNumber;
 
    // Appointment details
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
 
    // Reference to the treating doctor
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
 
    // Constructors
    public PatientDetails() {
    }
 
    public PatientDetails(String patientName, String patientInfo, int age, String address, String phoneNumber, LocalDate appointmentDate, LocalTime appointmentTime) {
        this.patientName = patientName;
        this.patientInfo = patientInfo;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }
 
    // Getters and Setters
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getPatientName() {
        return patientName;
    }
 
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
 
    public String getPatientInfo() {
        return patientInfo;
    }
 
    public void setPatientInfo(String patientInfo) {
        this.patientInfo = patientInfo;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public String getPhoneNumber() {
        return phoneNumber;
    }
 
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 
    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }
 
    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
 
    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }
 
    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
 
    public Doctor getDoctor() {
        return doctor;
    }
 
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
