package br.com.blog.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.blog.model.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
	Article findByTitle(String title);
	
	//This command find the objects for name without case sensitive
	@Query("select p from Article p where lower(p.title) like lower(concat('%', ?1, '%'))")
	List<Article> findAllByTitle(String title);
}
