package com.tmdb.moviedb.Repository.Implementation;

import java.util.List;

import com.tmdb.moviedb.Dao.GenreDao;
import com.tmdb.moviedb.Entities.Genres;
import com.tmdb.moviedb.Repository.Service.Genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreImpl implements Genre {
    @Autowired
    private GenreDao dao;

    @Override
    public List<Genres> getAllGenre() {

        return dao.findAll();
    }

    @Override
    public Genres addGenres(Genres newGenre) {
        return dao.save(newGenre);

    }

    @Override
    public Genres deleteGenres(int id) {
        Genres genre = dao.getById(id);
        dao.delete(genre);
        return null;
    }

}
