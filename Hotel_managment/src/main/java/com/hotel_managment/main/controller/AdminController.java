package com.hotel_managment.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel_managment.main.config.ApiResponse;
import com.hotel_managment.main.model.Admin;
import com.hotel_managment.main.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private  AdminService adminService;
	
	@PostMapping("/newadmin")
    public ResponseEntity<Admin> newAdmin(@RequestBody Admin admin){
//		   Admin db_admin= this.adminService.findByAdminByEmail(admin.getEmail());
//		    if(db_admin!=null) {
//		    	new ResponseEntity<Admin>(db_admin,HttpStatus.BAD_REQUEST);
//		    }
		    
		  Admin created_Admin=this.adminService.newAdmin(admin);
		  
		  return new ResponseEntity<Admin>(created_Admin,HttpStatus.CREATED);
	}
	
	
	@PostMapping("/signIn")
	
	public ResponseEntity<Admin> signIn(@RequestBody Admin admin){
		Admin db_Admin=this.adminService.signIn(admin.getEmail(),admin.getPassword());
		if(db_Admin==null) {
			return new ResponseEntity<Admin>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Admin>(db_Admin,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/{id}")
	
	public ResponseEntity<Admin> getAdmin(@PathVariable("id") int id) throws Exception{
		  Admin db_Admin=     this.adminService.getAdmin(id);
		  
		  return new ResponseEntity<Admin>(db_Admin,HttpStatus.OK);
		  
	}
	
	
	@GetMapping("/getAllAdmin")
	public ResponseEntity< List<Admin>> getadminList(){
		     List<Admin> adminList=         this.adminService.getAllAdmin();
		     
		     return new ResponseEntity<List<Admin>>(adminList,HttpStatus.OK);
		     
	}
	
	
	@PutMapping("/update/{id}")
	
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) throws Exception{
		  Admin updated_admin= this.adminService.updateAdmin(admin);
	  return new ResponseEntity<Admin>(updated_admin,HttpStatus.OK);
	  
	}
	
	@DeleteMapping("/delete/{id}")
	
	public ResponseEntity<ApiResponse> deleteAdmin(@PathVariable("id") int id) throws Exception{
		   this.adminService.deleteAdmin(id);
	
		   return new ResponseEntity<ApiResponse>(new ApiResponse("Admin deleted sucessfully"),HttpStatus.OK);
		  
		  
	}
	
}
