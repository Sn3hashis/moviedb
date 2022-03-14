package com.tmdb.moviedb.Repository.Implementation;

import java.util.List;

import com.tmdb.moviedb.Dao.MovieLanguageDao;
import com.tmdb.moviedb.Entities.MovieLanguage;
import com.tmdb.moviedb.Repository.Service.MovieLanguageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieLanguageImpl implements MovieLanguageService {
    @Autowired
    private MovieLanguageDao dao;

    @Override
    public MovieLanguage addNewMovieLanguage(MovieLanguage newLanguage) {
        return dao.save(newLanguage);

    }

    @Override
    public List<MovieLanguage> getAllMovieLanguages() {
        return dao.findAll();
    }

    @Override
    public MovieLanguage deleteMovieLanguage(int lanID) {
        // if (dao.getById(lanID) != null) {
        // MovieLanguage language = dao.getById(lanID);

        // dao.delete(language);

        // return dao.getById(lanID);
        // }

        // else
        // return null;
        // }
        MovieLanguage language = dao.getById(lanID);

        dao.delete(language);

        return null;
    }
}
