package com.cjc.angular.webservices.HomeServiceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.angular.ServiceInterface.ServiceInterface;
import com.cjc.angular.webservices.model.Student;
import com.cjc.angular.webservices.repository.HomeRepository;

@Service
public class HomeService implements ServiceInterface {

	@Autowired
	HomeRepository hr;
	
	
	@Override
	public Student SaveData(Student ss) 
	{
		
		return hr.save(ss);
	}


	@Override
	public Iterable<Student> getAllData() 
	{
		return hr.findAll();
	}


	@Override
	public Student loginCheck(String username, String password) {
		
		return hr.findByUsernameAndPassword(username, password);
	}


	@Override
	public Iterable<Student> addData(Student s) 
	{
		hr.save(s);
		return null;
	}

}
