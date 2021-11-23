package com.newsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newsapi.model.Favourite;
import com.newsapi.repo.FavouriteRepo;

@Service
public class FavouriteService {
	
	@Autowired
	private FavouriteRepo  repo;
	 
	public List<Favourite> getAllFavouriteArticle() {
		return repo.findAll();
	
	}
	
	public boolean  deleteFavouriteArticle(int id) {
		repo.deleteById(id);

		return !repo.existsById(id);

}
	
	public Favourite addFavouriteArticle(Favourite favourite) {
		
		return repo.save(favourite);
	}
}