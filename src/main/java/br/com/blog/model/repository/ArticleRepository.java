package br.com.blog.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.blog.model.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
	Article findByTitle(String title);
}
