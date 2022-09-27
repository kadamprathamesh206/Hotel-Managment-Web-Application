package com.hotel_managment.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel_managment.main.model.Admin;
import com.hotel_managment.main.repository.AdminRepo;

@Service
public class AdminService {

	@Autowired
	private AdminRepo adminRepo;

	public Admin newAdmin(Admin admin) {
		Admin saved_admin= this.adminRepo.save(admin);
		return saved_admin;

	}
	
	public List<Admin> getAllAdmin(){
		List<Admin> adminList= this.adminRepo.findAll();
		return adminList;
	}


	public Admin signIn(String email,String password) {
		Admin admin=this.adminRepo.findByEmailAndPassword(email, password);
		return admin;


	}

	public Admin updateAdmin(Admin admin) throws Exception {
		Admin db_admin=  this.adminRepo.findById(admin.getId()).orElseThrow(()-> new Exception("Admin not found"));
		db_admin.setName(admin.getName());
		db_admin.setPassword(admin.getPassword());
		return db_admin;
	}

	public Admin getAdmin(int id) throws Exception{
		Admin db_admin=  this.adminRepo.findById(id).orElseThrow(()-> new Exception("Admin not found"));
		return db_admin;

	}
	
	public void deleteAdmin(int id) throws Exception {
		Admin db_admin=  this.adminRepo.findById(id).orElseThrow(()-> new Exception("Admin not found"));
		  this.adminRepo.delete(db_admin);
		
	}
	
	
	public Admin  findByAdminByEmail(String email) {
		Admin db_admin=   this.adminRepo.findByEmail(email);
		
		return  db_admin;
	}
	
	

}
