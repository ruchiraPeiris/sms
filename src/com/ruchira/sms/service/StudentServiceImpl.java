package com.ruchira.sms.service;

import java.util.List;
import com.ruchira.sms.model.*;
import com.ruchira.sms.repository.HibernateStudentRepositoryImpl;
import com.ruchira.sms.repository.StudentRepository;

public class StudentServiceImpl implements StudentService{
	
	StudentRepository studentRepository;//=new HibernateStudentRepositoryImpl();

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> fetchAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.fetchAllStudents();
	}
	
	

}
