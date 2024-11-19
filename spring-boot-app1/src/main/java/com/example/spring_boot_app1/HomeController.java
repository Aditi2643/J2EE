package com.example.spring_boot_app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/about-me")
	public String aboutMe() {
		return "about-me.html";
	}
	
	@RequestMapping("/education")
	public String Education() {
		return "education.html";
	}
	
	@RequestMapping("/internship")
	public String Internship() {
		return "internship.html";
	}
	
	@RequestMapping("/skills")
	public String Skills() {
		return "skills.html";
	}
	
	@RequestMapping("/project")
	public String Project() {
		return "project.html";
	}
}
