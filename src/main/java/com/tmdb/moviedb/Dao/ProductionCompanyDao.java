package com.tmdb.moviedb.Dao;

import java.util.List;

import com.tmdb.moviedb.Entities.ProductionCompany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionCompanyDao extends JpaRepository<ProductionCompany, Integer> {
    public List<ProductionCompany> findByName(String name);
}
