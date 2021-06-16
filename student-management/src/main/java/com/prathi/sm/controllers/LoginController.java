package com.prathi.sm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prathi.sm.dao.StudentDAO;
import com.prathi.sm.dto.SignUpDTO;

@Controller
public class LoginController {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private StudentDAO studentDAO;

	@GetMapping("/signup")
	public String signup(@ModelAttribute("signupDTO") SignUpDTO signUpDTO) {
		return "signup";
	}

	@PostMapping("/process-signup")
	public String processSignUp(SignUpDTO signUpDTO) {

		signUpDTO.setPassword(passwordEncoder.encode(signUpDTO.getPassword()));
		studentDAO.saveuser(signUpDTO);

		return "redirect:/login";
	}

	@GetMapping("/login")
	public String login() {

		return "login";
	}
}
