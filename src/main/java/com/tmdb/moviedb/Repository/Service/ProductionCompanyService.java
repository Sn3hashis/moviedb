package com.tmdb.moviedb.Repository.Service;

import com.tmdb.moviedb.Entities.ProductionCompany;

import java.util.List;

public interface ProductionCompanyService {
    public List<ProductionCompany> getAllCompanies();

    public ProductionCompany addNewProductionCompany(ProductionCompany company);

    public ProductionCompany deleteProductionCompany(int id);

    public List<ProductionCompany> findByName(String name);
}
