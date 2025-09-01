package com.unifor.arquiteturas.serviceimpl;

import com.unifor.arquiteturas.model.Category;
import com.unifor.arquiteturas.repository.CategoryRepository;
import com.unifor.arquiteturas.service.CategoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryInterface {
    private CategoryRepository repository;

    @Override
    public Category createCategory(Category category) {
        return repository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        Optional<Category> category = repository.findById(id);
        return category.orElse(null);
    }
}
