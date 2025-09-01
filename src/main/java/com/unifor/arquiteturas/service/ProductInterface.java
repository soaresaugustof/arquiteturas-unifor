package com.unifor.arquiteturas.service;

import com.unifor.arquiteturas.model.Category;
import com.unifor.arquiteturas.model.Product;

import java.util.List;

public interface ProductInterface {
    public Product createProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(Long id);
    public List<Product> getProductsByCategory(Long categoryId);
}
