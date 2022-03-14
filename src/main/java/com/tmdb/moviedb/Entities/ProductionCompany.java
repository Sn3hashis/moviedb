package com.tmdb.moviedb.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class ProductionCompany {
    @Id
    private int id;
    private String logo;
    private String name;
    private String originCountry;

    public ProductionCompany() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public ProductionCompany(int id, String logo, String name, String originCountry) {
        this.id = id;
        this.logo = logo;
        this.name = name;
        this.originCountry = originCountry;
    }
}
