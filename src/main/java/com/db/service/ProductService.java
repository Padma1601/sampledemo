package com.db.service;

import java.util.List;

import com.db.dto.ProductDto;
import com.db.model.Product;

public interface ProductService {
public Product SaveProductInfo (ProductDto productdto);

public List<Product> getAllProductDetails();
}
