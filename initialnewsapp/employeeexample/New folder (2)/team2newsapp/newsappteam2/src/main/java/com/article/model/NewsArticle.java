package com.article.model;

import java.util.List;

public class NewsArticle {

	private String status;
	private int totalResults;
	private List<Article> articles;
	public NewsArticle(String status, int totalResults, List<Article> articles) {
		super();
		this.status = status;
		this.totalResults = totalResults;
		this.articles = articles;
	}
	public NewsArticle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles= articles;
	}
	@Override
	public String toString() {
		return "NewsArticle [status=" + status + ", totalResults=" + totalResults + "]";
	}
	
	

}
