package com.prathi.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prathi.sm.api.Student;
import com.prathi.sm.dao.StudentDAO;

@Service
public class serviceImpl implements ServiceInterface{

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public List<Student> ListOfStudents() {

		return studentDAO.showListOfStudents();
	}

	@Override
	public void addStudent(Student student) {
		
		studentDAO.addStudent(student);
	}

	@Override
	public Student fetchStudent(int id) {
		
		return studentDAO.getStudent(id);
	}

	@Override
	public void deleteStudent(int id) {
	
		studentDAO.removeStudent(id);
	}

	@Override
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
	}

}
