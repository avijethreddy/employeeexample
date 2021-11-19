package com.article.model;

public class Source {
	private String id;
	private String name;
	public Source() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Source(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Source [id=" + id + ", name=" + name + "]";
	}
	
}
