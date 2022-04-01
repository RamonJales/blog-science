package br.com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.blog.model.service.ArticleService;

@Controller
public class HomeController {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("articleList", articleService.findAll());
		return "/home/index";
	}
	
	@GetMapping("/article/{title}")
	public String getArticleDetails(Model model, @PathVariable("title") String title) {
		model.addAttribute("article", articleService.findByTitle(title));
		return "article/articleDetails";
	}
}