package com.tmdb.moviedb.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Genres {
    @Id
    private int id;
    private String genreName;

    public Genres(int id, String genreName) {
        this.id = id;
        this.genreName = genreName;
    }

    public Genres() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

}
