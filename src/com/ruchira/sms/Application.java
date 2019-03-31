package com.ruchira.sms;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruchira.sms.model.Student;
import com.ruchira.sms.service.StudentService;
import com.ruchira.sms.service.StudentServiceImpl;


public class Application {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		StudentService service=applicationContext.getBean("studentService", StudentService.class);
		//StudentService service=new StudentServiceImpl();
		List<Student> students=service.fetchAllStudents();
		
		for (Student student : students) {
			System.out.println("name :"+student.getName()+",college :"+student.getCollege());
		}
		
		
	}

}
