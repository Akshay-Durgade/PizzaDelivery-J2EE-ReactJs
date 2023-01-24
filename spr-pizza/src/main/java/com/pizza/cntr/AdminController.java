package com.pizza.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.model.Admin;

import com.pizza.service.AdminService;




@RestController
@CrossOrigin(value= {"http://localhost:3000"})

public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping(value= {"/registration/admin"})
	public String addUser(@RequestBody Admin admin) {
		adminService.saveUser(admin);
		return "admin added sucessfully";
	}
	
	
	// boolean return
	@PostMapping(value= {"/checkCredentials/admin"})
	public boolean checkCredentials(@RequestBody Admin admin, HttpSession session) {
		
		System.out.println(admin.getAdminid());
		System.out.println(admin.getPassword());
		
		List<Admin> lst = adminService.fetchAll();
		for (Admin a : lst) {
			if(a.getAdminid().equals(admin.getAdminid()) && a.getPassword().equals(admin.getPassword())) {
				session.setAttribute("id", admin.getId());
				System.out.println("admin login success,,,");
				return true;
			}
			
		}
		System.out.println(" admin login failed,,,");
		return false;
		
	}
	

	
}