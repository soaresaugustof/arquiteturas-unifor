package com.unifor.arquiteturas.model;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private Double price;
    private Category category;
}
