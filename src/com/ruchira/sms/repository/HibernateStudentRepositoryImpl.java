package com.ruchira.sms.repository;

import java.util.ArrayList;
import java.util.List;

import com.ruchira.sms.model.*;

public class HibernateStudentRepositoryImpl implements StudentRepository{
	
	public List<Student> fetchAllStudents(){
		
		List<Student> students=new ArrayList<>();
		Student student=new Student();
		student.setName("Krish");
		student.setCollege("richmond");
		students.add(student);
		return students;
		
	}
	

}
