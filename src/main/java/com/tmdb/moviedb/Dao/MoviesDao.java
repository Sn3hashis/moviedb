package com.tmdb.moviedb.Dao;

import com.tmdb.moviedb.Entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesDao extends JpaRepository<Movie, Integer> {

}
