package br.com.blog.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.blog.model.dao.ArticleDao;
import br.com.blog.model.entities.Article;

@Controller
public class ArticleController {
	@Autowired
	private ArticleDao articleRepository;
	
	@PostMapping("/new-article")
	public String saveArticle(@Valid Article article, BindingResult result, RedirectAttributes atributes) {
		if (result.hasErrors()) {
			atributes.addFlashAttribute("msg", "Verifique se os campos obrigatórios foram preenchidos!");
			return "redirect:/new-article";
		}
		article.setDate(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
		articleRepository.save(article);
		return "redirect:/";
	}
}
