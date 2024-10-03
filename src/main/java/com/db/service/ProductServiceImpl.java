package com.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.dto.ProductDto;
import com.db.model.Product;
import com.db.repository.ProductRepositoryService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepositoryService productRepositoryService;
@Override
public Product SaveProductInfo (ProductDto productdto) {
	Product product =new Product();
	product.setId(productdto.getId());
	product.setProductName(productdto.getProductName());
//	return productRepositoryService.save(product);
	return null;
}
@Override
public List<Product> getAllProductDetails() {
	// TODO Auto-generated method stub
	return productRepositoryService.findAll();
}

}
