package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Administrator;
import com.example.demo.repository.AdministratorRepository;

@Service
public class AdministratorService {
    @Autowired
    private AdministratorRepository administratorRepository;

    public Administrator findAdministratorByUsernameAndPassword(String username, String password) {
        return administratorRepository.findByUsernameAndPassword(username, password);
    }
}
