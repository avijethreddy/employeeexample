package com.article.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.article.model.NewsArticle;
import com.article.service.NewsArticleService;
@RestController
@RequestMapping("/topstories")

public class NewsArticleController {
	@Autowired
	NewsArticleService newsArticleService;
	
	@GetMapping("/{country}")
	public NewsArticle getTopArticles(@PathVariable String country) {
		return newsArticleService.getNewsArticleObject(country);
	}

}
