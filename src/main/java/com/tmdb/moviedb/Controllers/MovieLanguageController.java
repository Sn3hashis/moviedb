package com.tmdb.moviedb.Controllers;

import java.util.List;

import com.tmdb.moviedb.Entities.MovieLanguage;
import com.tmdb.moviedb.Repository.Service.MovieLanguageService;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<MovieLanguage> getAllMovieLanguages() {
        return language.getAllMovieLanguages();
    }

    @PostMapping("/languages/{newLanguage}")
    public MovieLanguage addNewMovieLanguage(@RequestBody MovieLanguage newLanguage) {
        return language.addNewMovieLanguage(newLanguage);
    }

    @DeleteMapping("/languages/{lanID}")
    public MovieLanguage deleteMovieLanguage(@PathVariable int lanID) {
        return language.deleteMovieLanguage(lanID);
    }
}
