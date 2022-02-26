package br.com.blog.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.blog.model.entities.Article;

@Repository
public interface ArticleDao extends JpaRepository<Article, Integer> {}
