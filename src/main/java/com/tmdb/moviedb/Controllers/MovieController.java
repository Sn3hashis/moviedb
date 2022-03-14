package com.tmdb.moviedb.Controllers;

import java.util.List;

import com.tmdb.moviedb.Entities.Movie;
import com.tmdb.moviedb.Repository.Service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/movie")
    public Movie addNewMovie(@RequestBody Movie newMovie) {
        return movieService.addNewMovie(newMovie);
    }

    @DeleteMapping("/movie/{id}")
    public Movie deleteMovie(@PathVariable int id) {
        return movieService.deleteMovie(id);
    }

}
