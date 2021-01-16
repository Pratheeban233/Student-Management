package com.prathi.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prathi.sm.api.Student;
import com.prathi.sm.dao.StudentDAO;
import com.prathi.sm.service.ServiceInterface;

@Controller
public class StudentController {

	@Autowired
	private ServiceInterface serice;

	@GetMapping("/showStudent")
	public String showStudentsList(Model model) {

		List<Student> showListOfStudents = serice.ListOfStudents();
		System.out.println("showListOfStudents : " + showListOfStudents.toString());
		model.addAttribute("studentsList", showListOfStudents);
		return "studentListPage";
	}

	@PostMapping("/addNewStudent")
	public String addNewStudent(@ModelAttribute("student") Student student) {

		return "add-New-student";
	}

	@GetMapping("/addStudent")
	public String addingStudent(Student student) {

		serice.addStudent(student);

		return "redirect:/showStudent";
	}

}
