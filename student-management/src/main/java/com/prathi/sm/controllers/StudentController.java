package com.prathi.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prathi.sm.api.Student;
import com.prathi.sm.dao.StudentDAO;
import com.prathi.sm.service.ServiceInterface;

@Controller
public class StudentController {

	@Autowired
	private ServiceInterface sericeImpl;

	@GetMapping("/showStudent")
	public String showStudentsList(Model model) {

		List<Student> showListOfStudents = sericeImpl.ListOfStudents();
		model.addAttribute("studentsList", showListOfStudents);
		
		return "studentListPage";
	}

	@PostMapping("/getStudentpage")
	public String addNewStudent(@ModelAttribute("student") Student student) {

		return "addstudentPage";
	}

	@GetMapping("/addStudent")
	public String addingStudent(Student student) {

		sericeImpl.addStudent(student);

		return "redirect:/showStudent";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("id") int id, Model model)
	{
		Student theStudent = sericeImpl.fetchStudent(id);
		model.addAttribute("student", theStudent);
		
		return "addstudentPage";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("id") int id)
	{
		sericeImpl.deleteStudent(id);
		
		return "redirect:/showStudent";
	}

}
