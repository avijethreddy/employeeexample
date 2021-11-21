package com.newsapi.controller;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.newsapi.model.Articles;
import com.newsapi.model.NewsArticle;
import com.newsapi.service.NewsApiService;

@RestController
@RequestMapping("/News")
public class NewsApiController {
	
	
	
	@Autowired
private NewsApiService services;
	
	

	@RequestMapping("/allnews/{q}")
	public NewsArticle fetchEverything(@PathVariable String q) throws Exception {
    return services.getEverything(q);
	}
	
	@RequestMapping("/headlines/{country}")
	public NewsArticle fetchHeadlines(@PathVariable String country) throws Exception{
	return services.getTopHeadlines(country);
	}

}