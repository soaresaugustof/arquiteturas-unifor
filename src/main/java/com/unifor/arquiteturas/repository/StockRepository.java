package com.unifor.arquiteturas.repository;

import com.unifor.arquiteturas.model.Product;
import com.unifor.arquiteturas.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock,Long> {
    List<Stock> findByProduct(Product product);
}
