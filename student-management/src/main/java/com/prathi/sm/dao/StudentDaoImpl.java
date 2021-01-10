package com.prathi.sm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prathi.sm.api.Student;
import com.prathi.sm.rowmapper.StudentRowmapper;

@Repository
public class StudentDaoImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> showListOfStudents() {

		String sql = "SELECT * FROM students;";

		List<Student> listOfStudents = jdbcTemplate.query(sql, new StudentRowmapper());

		return listOfStudents;
	}

}
