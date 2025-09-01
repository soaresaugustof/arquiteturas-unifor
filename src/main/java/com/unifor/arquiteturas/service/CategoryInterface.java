package com.unifor.arquiteturas.service;

import com.unifor.arquiteturas.model.Category;

import java.util.List;

public interface CategoryInterface {
    public Category createCategory(Category category);
    public List<Category> getAllCategories();
    public Category getCategoryById(Long id);
}
