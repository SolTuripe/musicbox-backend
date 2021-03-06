package com.musicbox.musicbox.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.musicbox.musicbox.model.Product;
import com.musicbox.musicbox.repository.ProductRepository;

@Service

public class ProductServiceImp implements ProductService { 

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
    return productRepository.save(product);
}

    @Override
    public List <Product> getAlProducts() {
    return productRepository.findAll();

    }

}