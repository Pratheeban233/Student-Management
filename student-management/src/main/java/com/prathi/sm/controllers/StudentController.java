package com.prathi.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.prathi.sm.api.Student;
import com.prathi.sm.dao.StudentDAO;

@Controller
public class StudentController {

	@Autowired
	private StudentDAO studentDAO;

	@GetMapping("/showStudent")
	public String showStudentsList(Model model) {

		List<Student> showListOfStudents = studentDAO.showListOfStudents();
		model.addAttribute("studentsList", showListOfStudents);
		
		System.out.println(showListOfStudents.toString());

		return "studentListPage";
	}

}
