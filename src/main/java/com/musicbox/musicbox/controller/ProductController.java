package com.musicbox.musicbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musicbox.musicbox.model.Product;
import com.musicbox.musicbox.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin

public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public String add(@RequestBody Product product) {
        productService.saveProduct(product);
        return "new product is added";
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAlProducts();
    }

}
