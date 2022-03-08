package br.com.blog.config;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.blog.model.dao.ArticleDao;
import br.com.blog.model.entities.Article;

@Configuration
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	ArticleDao articleRepository;

	@Override
	public void run(String... args) throws Exception {
		Article obj1 = new Article(null, "Articl title", "Ramon Jales", LocalDateTime.now(), "Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus.");
		Article obj2 = new Article(null, "Articl title", "Ramon Jales", LocalDateTime.now(), "Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus.");
		Article obj3 = new Article(null, "Articl title", "Ramon Jales", LocalDateTime.now(), "Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus.");
		Article obj4 = new Article(null, "Articl title", "Ramon Jales", LocalDateTime.now(), "Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus.");
		Article obj5 = new Article(null, "Articl title", "Ramon Jales", LocalDateTime.now(), "Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus.");
		Article obj6 = new Article(null, "Articl title", "Ramon Jales", LocalDateTime.now(), "Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus.");
		Article obj7 = new Article(null, "Articl title", "Ramon Jales", LocalDateTime.now(), "Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus.");
		Article obj8 = new Article(null, "Articl title", "Ramon Jales", LocalDateTime.now(), "Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus. Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusantium neque at sit molestias doloremque odit labore, possimus hic voluptates reprehenderit eos suscipit. Velit reiciendis iste perferendis architecto enim maxime ducimus.");
		
		articleRepository.save(obj1);
		articleRepository.save(obj2);
		articleRepository.save(obj3);
		articleRepository.save(obj4);
		articleRepository.save(obj5);
		articleRepository.save(obj6);
		articleRepository.save(obj7);
		articleRepository.save(obj8);
		
		List<Article> list = articleRepository.findAll();
		
		for (Article article : list) {
			System.out.println(article.toString());
		}
	}	
	
}
