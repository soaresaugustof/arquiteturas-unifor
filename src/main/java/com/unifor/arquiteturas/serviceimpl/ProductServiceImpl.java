package com.unifor.arquiteturas.serviceimpl;

import com.unifor.arquiteturas.model.Category;
import com.unifor.arquiteturas.model.Product;
import com.unifor.arquiteturas.repository.CategoryRepository;
import com.unifor.arquiteturas.repository.ProductRepository;
import com.unifor.arquiteturas.service.ProductInterface;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductInterface {
    private ProductRepository repository;
    private CategoryRepository categoryRepository;

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> product = repository.findById(id);
        return product.orElse(null);
    }

    @Override
    public List<Product> getProductsByCategoryId(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElse(null);
        if (category != null) {
            return repository.findByCategory(category);
        }
        return null;
    }
}
