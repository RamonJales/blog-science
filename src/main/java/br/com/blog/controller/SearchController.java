package br.com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.blog.model.service.ArticleService;

@Controller
public class SearchController {
	
	@Autowired
	private ArticleService articleService;
	
	@PostMapping("/search")
	public String search(Model model, @RequestParam("searchname") String searchName) {
		model.addAttribute("articles", articleService.findAllByTitle(searchName));
		return "/article/article-pagination";
	}
}
