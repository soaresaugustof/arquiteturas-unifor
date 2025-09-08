package com.unifor.arquiteturas.controller;

import com.unifor.arquiteturas.model.Stock;
import com.unifor.arquiteturas.service.StockInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadastrar-estoque")
public class StockController {
    private StockInterface stockInterface;

    @PostMapping("/create")
    public ResponseEntity<Stock> createStock(@RequestBody Stock stock){
        return ResponseEntity.ok(stockInterface.createStock(stock));
    }

    @GetMapping("/allStocks")
    public ResponseEntity<List<Stock>> getAllStocks(){
        return ResponseEntity.ok(stockInterface.getAllStocks());
    }

    @GetMapping("/stock/{id}")
    public ResponseEntity<Stock> getStockById(@RequestParam Long id){
        return ResponseEntity.ok(stockInterface.getStockById(id));
    }

    @GetMapping("/stocksByProduct/{productId}")
    public ResponseEntity<List<Stock>> getStockByProductId(@RequestParam Long productId) {
        return ResponseEntity.ok(stockInterface.getStockByProductId(productId));
    }
}
