package com.db.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.dto.ProductDto;
import com.db.model.Product;
import com.db.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping ("/product")
public class ProductController {
@Autowired
private ProductService productService;
@PostMapping("/saveproduct")
public  Map<String,Object> saveproduct (@RequestBody ProductDto productdto) {
	Product product=productService.SaveProductInfo(productdto);
	Map<String, Object>response=new HashMap<>();
	
	if(product!=null) {
		response.put("status", HttpStatus.OK);
		response.put("message", "Success");
		response.put("timestamp",new Date());
		return response;
	}
	response.put("status",HttpStatus.BAD_REQUEST );
	response.put("message", "failed");
	response.put("timestamp",new Date());
	return response;
   
   
}
@GetMapping("/getproductdetail")
public List<Product>getAllProductDetails(){
	return productService.getAllProductDetails();
}
}