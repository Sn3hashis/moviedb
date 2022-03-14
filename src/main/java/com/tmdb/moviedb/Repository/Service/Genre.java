package com.tmdb.moviedb.Repository.Service;

import java.util.List;

import com.tmdb.moviedb.Entities.Genres;

public interface Genre {
    public List<Genres> getAllGenre();

    public Genres addGenres(Genres newGenre);

    public Genres deleteGenres(int id);
}
