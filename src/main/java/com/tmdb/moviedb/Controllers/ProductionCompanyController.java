package com.tmdb.moviedb.Controllers;

import java.util.List;

import com.tmdb.moviedb.Entities.ProductionCompany;
import com.tmdb.moviedb.Repository.Service.ProductionCompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductionCompanyController {
    @Autowired
    private ProductionCompanyService service;

    @GetMapping("/companies")
    public List<ProductionCompany> getAllCompanies() {
        return service.getAllCompanies();
    }

    @PostMapping("/newcompany")
    public ProductionCompany addNewProductionCompany(@RequestBody ProductionCompany company) {
        return service.addNewProductionCompany(company);
    }

    @DeleteMapping("/companies/{id}")
    public ProductionCompany deleteProductionCompany(@PathVariable int id) {
        return service.deleteProductionCompany(id);
    }

    @GetMapping("/companies/{name}")
    public List<ProductionCompany> findByName(@PathVariable String name) {
        return service.findByName(name);
    }
}
