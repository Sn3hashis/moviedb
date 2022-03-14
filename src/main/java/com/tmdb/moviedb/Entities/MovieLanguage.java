package com.tmdb.moviedb.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieLanguage {
    @Id
    private int id;

    private String english_name;

    private String name;

    private String iso_639_1;

    public MovieLanguage(int id, String english_name, String name, String iso_639_1) {
        this.id = id;
        this.english_name = english_name;
        this.name = name;
        this.iso_639_1 = iso_639_1;
    }

    public MovieLanguage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnglish_name() {
        return english_name;
    }

    public void setEnglish_name(String english_name) {
        this.english_name = english_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso_639_1() {
        return iso_639_1;
    }

    public void setIso_639_1(String iso_639_1) {
        this.iso_639_1 = iso_639_1;
    }

}
