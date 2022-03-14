package com.tmdb.moviedb.Repository.Implementation;

import java.util.List;

import com.tmdb.moviedb.Dao.MoviesDao;
import com.tmdb.moviedb.Entities.Movie;
import com.tmdb.moviedb.Repository.Service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieImpl implements MovieService {
    @Autowired
    public MoviesDao moviesDao;

    @Override
    public List<Movie> getAllMovies() {

        return moviesDao.findAll();
    }

    @Override
    public Movie addNewMovie(Movie newMovie) {
        moviesDao.save(newMovie);
        return newMovie;
    }

    @Override
    public Movie deleteMovie(int id) {
        Movie entity = moviesDao.getById(id);
        moviesDao.delete(entity);
        return null;
    }

}
