package com.tmdb.moviedb.Dao;

import com.tmdb.moviedb.Entities.ProductionCompany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionCompanyDao extends JpaRepository<ProductionCompany, Integer> {

}
