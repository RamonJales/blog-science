package br.com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.blog.model.dao.ArticleDao;

@Controller
public class HomeController {
	
	@Autowired
	private ArticleDao articleRepository;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("articleList", articleRepository.findAll());
		return "/home/index";
	}
}
