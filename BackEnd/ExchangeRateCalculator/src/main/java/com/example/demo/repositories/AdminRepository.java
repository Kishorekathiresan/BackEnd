package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.demo.entities.AdminDetails;
 
@Repository
public interface AdminRepository extends JpaRepository<AdminDetails, Long> {
	AdminDetails findByUsernameAndPassword(String username, String password);
}