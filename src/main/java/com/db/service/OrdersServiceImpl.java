package com.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.dto.OrdersDto;
import com.db.model.Orders;
import com.db.repository.CustomerRepositoryService;
import com.db.repository.OrdersRepositoryService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private CustomerRepositoryService customerRepositoryService;
	@Autowired
	private OrdersRepositoryService ordersRepositoryService;


	@Override
	public Orders SaveOrdersInfo(OrdersDto ordersDto) {
		Orders order = new Orders();
		order.setId(ordersDto.getId());
		order.setProductId(ordersDto.getProductId());
		order.setProductName(ordersDto.getProductName());
		order.setProductPrice(ordersDto.getProductPrice());
		order.setOrderDate(ordersDto.getOrderDate());
		order.setDeliveryDate(ordersDto.getDeliveryDate());
		order.setDeliveryLocation(ordersDto.getDeliveryLocation());
		order.setCustomer(customerRepositoryService.findById(ordersDto.getCustomerId()).get());
		return ordersRepositoryService.save(order);
	}

	@Override
	public List<Orders> getAllOrdersDetails() {
		return ordersRepositoryService.findAll();
	}
}
