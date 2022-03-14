package com.tmdb.moviedb.Repository.Service;

import java.util.List;

import com.tmdb.moviedb.Entities.MovieLanguage;

public interface MovieLanguageService {
    public MovieLanguage addNewMovieLanguage(MovieLanguage newLanguage);

    public List<MovieLanguage> getAllMovieLanguages();

    public MovieLanguage deleteMovieLanguage(int lanID);
}
