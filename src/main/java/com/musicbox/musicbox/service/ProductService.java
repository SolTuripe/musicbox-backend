package com.musicbox.musicbox.service;

import com.musicbox.musicbox.model.Product;
import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);
    public List <Product> getAlProducts();

}
