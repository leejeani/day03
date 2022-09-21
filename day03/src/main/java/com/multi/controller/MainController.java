package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("center", "about");
		model.addAttribute("left", "left_about");
		return "main";
	}
	
	@RequestMapping("/projects")
	public String projects(Model model) {
		model.addAttribute("center", "projects");
		model.addAttribute("left", "left_projects");
		return "main";
	}
	
	@RequestMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("center", "contact");
		model.addAttribute("left", "left_contact");
		return "main";
	}
	
}













