package com.db.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.model.Orders;

@Repository
public interface OrdersRepositoryService extends JpaRepository<Orders, Long>{


	


}
