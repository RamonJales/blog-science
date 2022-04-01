package br.com.blog.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.blog.model.entities.Article;
import br.com.blog.model.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@PostMapping("/new-article")
	public String saveArticle(@Valid Article article, BindingResult result, RedirectAttributes atributes) {
		if (result.hasErrors()) {
			atributes.addFlashAttribute("msg", "Verifique se os campos obrigatórios foram preenchidos!");
			return "redirect:/new-article";
		}
		article.setDate(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
		articleService.save(article);
		return "redirect:/";
	}
}
