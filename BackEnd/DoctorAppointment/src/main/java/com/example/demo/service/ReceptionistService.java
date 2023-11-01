package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Receptionist;
import com.example.demo.repository.ReceptionistRepository;

@Service
public class ReceptionistService {
    @Autowired
    private ReceptionistRepository receptionistRepository;

    public Receptionist findReceptionistByUsernameAndPassword(String username, String password) {
        return receptionistRepository.findByUsernameAndPassword(username, password);
    }
}

