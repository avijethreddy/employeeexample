package com.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.article.model.NewsArticle;

public class NewsArticleService {
	@Autowired
	NewsArticle newsArticle;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public NewsArticle  getNewsArticleObject(String country) {
		  String api_key = "3062717a1dc34ffaa233da47522fa458";
			String requrl = "https://newsapi.org/v2/top-headlines?"+"country="+country+"&apiKey="+api_key;
			return restTemplate.getForObject(requrl, NewsArticle.class);
	
	}
	
}


