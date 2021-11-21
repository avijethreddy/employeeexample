package com.newsapi.model;

public class Articles {
	private Source source;
	private String url;
	private String author;
	private String title;
	private String description;
	private String publishedAt;
	
	public Articles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Articles(String url, String author, String title, String description, Source source,String publishedAt) {
		super();
		this.url = url;
		this.author = author;
		this.title = title;
		this.description = description;
		this.source = source;
		this.publishedAt=publishedAt;
	}
	public String getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	@Override
	public String toString() {
		return "Articles [url=" + url + ", author=" + author + ", title=" + title + ", description=" + description
				+ ", source=" + source + ",publishedAt="+publishedAt+"]";
	}
	
}
