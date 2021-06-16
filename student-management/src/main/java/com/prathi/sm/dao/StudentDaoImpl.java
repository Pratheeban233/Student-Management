package com.prathi.sm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prathi.sm.api.Student;
import com.prathi.sm.dto.SignUpDTO;
import com.prathi.sm.rowmapper.StudentRowmapper;

@Repository
public class StudentDaoImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void saveuser(SignUpDTO signUpDTO) {
		
		String saveusers = "INSERT INTO users values (?,?,?)";
		
		jdbcTemplate.update(saveusers, signUpDTO.getUsername(),signUpDTO.getPassword(),true);
		
		String saveAuthorities = "INSERT INTO authorities values (?,?)";
		
		jdbcTemplate.update(saveAuthorities, signUpDTO.getUsername(),"User");
		
	}
	

	@Override
	public List<Student> showListOfStudents() {

		String sql = "SELECT * FROM students";

		List<Student> listOfStudents = jdbcTemplate.query(sql, new StudentRowmapper());
		
		return listOfStudents;
	}

	@Override
	public void addStudent(Student student) {

		String sql = "insert into students (name,mobile,country) values (?,?,?)";

		Object[] args = { student.getName(), student.getMobile(), student.getCountry() };

		jdbcTemplate.update(sql, args);
	}

	@Override
	public Student getStudent(int id) {

		String sql = "select * from students where id = ?";

		Student theStudent = jdbcTemplate.queryForObject(sql, new StudentRowmapper(), id);

		return theStudent;
	}

	@Override
	public void removeStudent(int id) {

		String sql = "delete from students where id =?";

		jdbcTemplate.update(sql, id);

	}

	@Override
	public void updateStudent(Student student) {

		System.out.println("update Student : " + student.toString());

		String sql = "update students set name=?, mobile=?, country=? where id=?";

		Object[] args = { student.getName(), student.getMobile(), student.getCountry(), student.getId() };

		jdbcTemplate.update(sql, args);
	}

}
