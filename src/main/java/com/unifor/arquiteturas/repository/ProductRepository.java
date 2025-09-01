package com.unifor.arquiteturas.repository;

import com.unifor.arquiteturas.model.Category;
import com.unifor.arquiteturas.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByCategory(Category category);
}
