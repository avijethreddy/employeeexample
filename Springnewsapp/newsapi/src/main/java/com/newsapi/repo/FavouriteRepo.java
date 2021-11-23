package com.newsapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newsapi.model.Favourite;

@Repository
public interface FavouriteRepo extends JpaRepository<Favourite, Integer>{

}
