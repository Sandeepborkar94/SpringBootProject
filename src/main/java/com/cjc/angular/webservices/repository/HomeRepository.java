package com.cjc.angular.webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.angular.webservices.model.Student;


@Repository
public interface HomeRepository extends JpaRepository<Student, Integer>
{
	public Student findByUsernameAndPassword(String username,String password);

}
