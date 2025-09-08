package com.unifor.arquiteturas.serviceimpl;

import com.unifor.arquiteturas.model.Product;
import com.unifor.arquiteturas.model.Stock;
import com.unifor.arquiteturas.repository.ProductRepository;
import com.unifor.arquiteturas.repository.StockRepository;
import com.unifor.arquiteturas.service.StockInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockInterface {
    private StockRepository repository;
    private ProductRepository productRepository;

    @Override
    public Stock createStock(Stock stock) {
        return repository.save(stock);
    }

    @Override
    public List<Stock> getAllStocks() {
        return repository.findAll();
    }

    @Override
    public Stock getStockById(Long id) {
        Optional<Stock> stock = repository.findById(id);
        return stock.orElse(null);
    }

    @Override
    public List<Stock> getStockByProductId(Long productId) {
        Product product = productRepository.findById(productId).orElse(null);
        if (product != null) {
            return repository.findByProduct(product);
        }
        return null;
    }
}
