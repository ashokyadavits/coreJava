package com.example.codeCommerce.impl;
import com.example.codeCommerce.entity.ProductEntity;
import com.example.codeCommerce.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl  {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> findExpensiveProducts(double priceLimit) {
        String query = "SELECT p FROM Product p WHERE p.price > :priceLimit";
        return null;

    }
}