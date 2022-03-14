package com.tmdb.moviedb.Dao;

import com.tmdb.moviedb.Entities.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreDao extends JpaRepository<Genres, Integer> {

}
