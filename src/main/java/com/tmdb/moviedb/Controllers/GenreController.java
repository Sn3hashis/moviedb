package com.tmdb.moviedb.Controllers;

import java.util.List;
import java.util.Optional;

import com.tmdb.moviedb.Entities.Genres;
import com.tmdb.moviedb.Repository.Service.Genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Genres>> getAllGenre() {
        List<Genres> allGenres = genre.getAllGenre();
        try {
            if (allGenres.size() <= 0) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } else
                return ResponseEntity.of(Optional.of(genre.getAllGenre()));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @PostMapping("/add{newGenre}")
    public ResponseEntity<Genre> addGenres(@RequestBody Genres newGenre) {

        try {
            genre.addGenres(newGenre);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @DeleteMapping("/genres/{id}")
    public ResponseEntity<Genres> deleGenres(@PathVariable int id) {

        try {
            genre.deleteGenres(id);

            return ResponseEntity.status(HttpStatus.OK).build();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

}
