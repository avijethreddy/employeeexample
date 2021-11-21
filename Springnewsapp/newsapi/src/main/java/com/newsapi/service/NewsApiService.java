package com.newsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.newsapi.model.NewsArticle;



@Service

public class NewsApiService {
	private String headlines_url="https://newsapi.org/v2/top-headlines?";
	
	private String allnews_url="https://newsapi.org/v2/everything?";
	

	
	@Autowired
	private RestTemplate restTemplate;
	String apiKey= "c8e429fdb1614e0a80a048bde81700fc";
	
	

	public NewsArticle getEverything(String q) throws Exception {
		String url =allnews_url +"q="+q+ "&apiKey=" + apiKey ;
		NewsArticle news= restTemplate.getForObject(url, NewsArticle.class);
		return news;	
		
	}
	
	
	public NewsArticle getTopHeadlines(String country) throws Exception {
		String url = headlines_url+"country="+country+ "&apiKey=" + apiKey ;

	 NewsArticle news=restTemplate.getForObject(url, NewsArticle.class);
			return news;
		}
}


