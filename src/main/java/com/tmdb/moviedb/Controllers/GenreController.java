package com.tmdb.moviedb.Controllers;

import java.util.List;

import com.tmdb.moviedb.Entities.Genres;
import com.tmdb.moviedb.Repository.Service.Genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenreController {
    @Autowired
    private Genre genre;

    @GetMapping("/genres")
    public List<Genres> getAllGenre() {
        return genre.getAllGenre();
    }

    @PostMapping("/add{newGenre}")
    public Genres addGenres(@RequestBody Genres newGenre) {
        return genre.addGenres(newGenre);
    }

    @DeleteMapping("/genres/{id}")
    public Genres deleGenres(@PathVariable int id) {
        return genre.deleteGenres(id);
    }

}
