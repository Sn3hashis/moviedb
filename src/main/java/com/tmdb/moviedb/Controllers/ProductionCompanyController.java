package com.tmdb.moviedb.Controllers;

import java.util.List;
import java.util.Optional;

import com.tmdb.moviedb.Entities.ProductionCompany;
import com.tmdb.moviedb.Repository.Service.ProductionCompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<ProductionCompany>> getAllCompanies() {
        try {
            List<ProductionCompany> productionCompanies = service.getAllCompanies();
            if (productionCompanies.size() <= 0) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } else
                return ResponseEntity.of(Optional.of(service.getAllCompanies()));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @PostMapping("/newcompany")
    public ResponseEntity<ProductionCompany> addNewProductionCompany(@RequestBody ProductionCompany company) {

        try {
            service.addNewProductionCompany(company);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @DeleteMapping("/companies/{id}")
    public ResponseEntity<ProductionCompany> deleteProductionCompany(@PathVariable int id) {
        try {
            service.deleteProductionCompany(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @GetMapping("/companies/{name}")
    public ResponseEntity<List<ProductionCompany>> findByName(@PathVariable String name) {
        try {
            List<ProductionCompany> prodComp = service.findByName(name);
            if (prodComp.size() <= 0) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            } else
                return ResponseEntity.of(Optional.of(service.findByName(name)));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
