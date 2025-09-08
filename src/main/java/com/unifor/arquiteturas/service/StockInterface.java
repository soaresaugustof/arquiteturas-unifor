package com.unifor.arquiteturas.service;

import com.unifor.arquiteturas.model.Stock;

import java.util.List;

public interface StockInterface {
    public Stock createStock(Stock stock);
    public List<Stock> getAllStocks();
    public Stock getStockById(Long id);
    public List<Stock> getStockByProductId(Long productId);
}
