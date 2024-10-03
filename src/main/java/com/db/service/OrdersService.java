package com.db.service;
import java.util.List;

import com.db.dto.OrdersDto;
import com.db.model.Orders;

public interface OrdersService {
	public Orders SaveOrdersInfo(OrdersDto ordersDto);
	public List<Orders>getAllOrdersDetails();
}
