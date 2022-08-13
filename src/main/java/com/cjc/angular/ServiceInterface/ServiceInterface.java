package com.cjc.angular.ServiceInterface;

import com.cjc.angular.webservices.model.Student;

public interface ServiceInterface 
{
	public Student SaveData(Student ss);

	public Iterable<Student> getAllData();

	public Student loginCheck(String username, String password);

	public Iterable<Student> addData(Student s);

}
