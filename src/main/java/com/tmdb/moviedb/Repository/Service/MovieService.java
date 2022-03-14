package com.tmdb.moviedb.Repository.Service;

import java.util.List;

import com.tmdb.moviedb.Entities.Movie;

public interface MovieService {

    public List<Movie> getAllMovies();

    public Movie addNewMovie(Movie newMovie);

    public Movie deleteMovie(int id);

}
