package com.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.model.Product;

@Repository
public interface ProductRepositoryService extends JpaRepository<Product, Long> {

}
