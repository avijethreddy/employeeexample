package com.newsapi.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.newsapi.model.Favourite;
import com.newsapi.service.FavouriteService;

@Controller
public class FavouriteController {
		
	
	@Autowired
		FavouriteService service;
	
	
	@GetMapping("/favourite/list")
	public List<Favourite> getFavouriteList(){
		return service.getAllFavouriteArticle();
	}
		

	@DeleteMapping("/favourite/delete/{id}")
	public boolean deleteFavouriteArticle(@PathParam("id")int id){
		return service.deleteFavouriteArticle(id);
	}
	

	@PostMapping("/favourite/add/")
	public Favourite getFavouriteArticle(@RequestBody Favourite favourite){
		return service.addFavouriteArticle(favourite);
	}
}
