package com.unifor.arquiteturas.controller;

import com.unifor.arquiteturas.model.Product;
import com.unifor.arquiteturas.service.ProductInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadastrar-produto")
public class ProductController {

    private ProductInterface productInterface;

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productInterface.createProduct(product));
    }

    @GetMapping("/allProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productInterface.getAllProducts());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@RequestParam Long id) {
        return ResponseEntity.ok(productInterface.getProductById(id));
    }

    @GetMapping("/productsByCategory/{categoryId}")
    public ResponseEntity<List<Product>> getProductsByCategoryId(Long categoryId){
        return ResponseEntity.ok(productInterface.getProductsByCategoryId(categoryId));
    }
}
