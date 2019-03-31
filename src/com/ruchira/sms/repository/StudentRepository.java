package com.ruchira.sms.repository;

import java.util.List;

import com.ruchira.sms.model.*;

public interface StudentRepository {

	public List<Student> fetchAllStudents();
}
