package com.unifor.arquiteturas.controller;

import com.unifor.arquiteturas.model.Category;
import com.unifor.arquiteturas.service.CategoryInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadastrar-categoria")
public class CategoryController {
    private CategoryInterface categoryInterface;

    @PostMapping("/create")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return ResponseEntity.ok(categoryInterface.createCategory(category));
    }

    @GetMapping("/allCategories")
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryInterface.getAllCategories());
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<Category> getCategoryById(@RequestParam Long id) {
        return ResponseEntity.ok(categoryInterface.getCategoryById(id));
    }
}
