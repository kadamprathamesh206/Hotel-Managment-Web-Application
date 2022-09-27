package com.hotel_managment.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel_managment.main.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

	public  Admin findByEmailAndPassword(String email,String password);
	
	public Admin findByEmail(String email);
}
