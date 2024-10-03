package com.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.model.Customer;

@Repository
public interface CustomerRepositoryService extends JpaRepository<Customer, Long> {

}
