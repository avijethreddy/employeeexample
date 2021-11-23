package com.newsapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Favourite_Article")
public class Favourite extends  Articles{
	@Id
		private int id;
		private String title;
		
		public Favourite() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Favourite(String url, String author, String title, String description, Source source,
				String publishedAt) {
			super(url, author, title, description, source, publishedAt);
			// TODO Auto-generated constructor stub
		}
		public Favourite(int id, String title) {
			super();
			this.id = id;
			this.title = title;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		@Override
		public String toString() {
			return "Favourite [id=" + id + ", title=" + title + "]";
		}
		
		
}
