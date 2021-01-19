package com.prathi.sm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prathi.sm.api.Student;

public interface ServiceInterface {

	List<Student> ListOfStudents();
	
	void addStudent(Student student);
	
	Student fetchStudent(int id);

	void deleteStudent(int id);

	void updateStudent(Student student);
}
