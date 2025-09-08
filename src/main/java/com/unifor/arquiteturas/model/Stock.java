package com.unifor.arquiteturas.model;

import com.unifor.arquiteturas.service.ProductInterface;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Stock {
    private Long id;
    private Product product;
    private Integer quantity;
    private LocalDateTime lastUpdated;
}
