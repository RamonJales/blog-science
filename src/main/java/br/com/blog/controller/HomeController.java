package br.com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("msg", "Controller running successfully!");
		return "/home/index";
	}

}
