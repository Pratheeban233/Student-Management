package com.prathi.sm.dao;

import java.util.List;

import com.prathi.sm.api.Student;

public interface StudentDAO {

	List<Student> showListOfStudents();

	void addStudent(Student student);

	Student getStudent(int id);

	void removeStudent(int id);

	void updateStudent(Student student);
}
