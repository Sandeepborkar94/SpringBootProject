package com.cjc.angular.webservices.homeController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.angular.ServiceInterface.ServiceInterface;
import com.cjc.angular.webservices.model.Student;

	@CrossOrigin("*")
	@RestController
	public class HomeController
	{
		@Autowired
		ServiceInterface si;
		
		@RequestMapping("/")
		public void save() 
		{	
			Student ss = new Student();
			ss.setRollno(1);
			ss.setName("Sandeep");
			ss.setUsername("Sandeep.borkar");
			ss.setPassword("Sandeep");
			ss.setAddress("Gondia");
			
			si.SaveData(ss);
		}
		
		@GetMapping("/getData")
		public Iterable<Student> getData()
		{
			return si.getAllData();	
		}
		
		@GetMapping("/getLogin/{username}/{password}")
		public Student getLogin(@PathVariable("username")String username,@PathVariable("password")String password) 
		{
			Student s = si.loginCheck(username,password);
			return s;
		}
		
		@PostMapping("/addData")
		public Iterable<Student> addData(@RequestBody Student s)
		{
			return this.si.addData(s);
			
			
		}
		
		


}
