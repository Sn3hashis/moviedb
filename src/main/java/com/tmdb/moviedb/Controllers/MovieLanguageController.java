package com.tmdb.moviedb.Controllers;

import java.util.List;
import java.util.Optional;

import com.tmdb.moviedb.Entities.MovieLanguage;
import com.tmdb.moviedb.Repository.Service.MovieLanguageService;

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
public class MovieLanguageController {
    @Autowired
    private MovieLanguageService language;

    @GetMapping("/languages")
    public ResponseEntity<List<MovieLanguage>> getAllMovieLanguages() {

        try {
            List<MovieLanguage> languages = language.getAllMovieLanguages();
            if (languages.size() <= 0) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } else
                return ResponseEntity.of(Optional.of(language.getAllMovieLanguages()));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @PostMapping("/languages/{newLanguage}")
    public ResponseEntity<MovieLanguage> addNewMovieLanguage(@RequestBody MovieLanguage newLanguage) {
        try {
            language.addNewMovieLanguage(newLanguage);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @DeleteMapping("/languages/{lanID}")
    public ResponseEntity<MovieLanguage> deleteMovieLanguage(@PathVariable int lanID) {
        try {
            language.deleteMovieLanguage(lanID);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
