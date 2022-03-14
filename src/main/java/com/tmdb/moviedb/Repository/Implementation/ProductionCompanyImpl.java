package com.tmdb.moviedb.Repository.Implementation;

import java.util.List;

import com.tmdb.moviedb.Dao.ProductionCompanyDao;
import com.tmdb.moviedb.Entities.ProductionCompany;
import com.tmdb.moviedb.Repository.Service.ProductionCompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductionCompanyImpl implements ProductionCompanyService {
    @Autowired
    private ProductionCompanyDao companyDao;

    @Override
    public List<ProductionCompany> getAllCompanies() {

        return companyDao.findAll();
    }

    @Override
    public ProductionCompany addNewProductionCompany(ProductionCompany company) {
        companyDao.save(company);
        return company;
    }

    @Override
    public ProductionCompany deleteProductionCompany(int id) {
        ProductionCompany entity = companyDao.getById(id);
        companyDao.delete(entity);

        return null;
    }

}
