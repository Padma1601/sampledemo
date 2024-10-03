package com.db.controller;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.db.dto.OrdersDto;
import com.db.model.Orders;
import com.db.service.OrdersService;

@RestController
@RequestMapping("Orders")
public class OrdersController {
		@Autowired
		private OrdersService ordersService;

		@PostMapping("/saveorder")
		public Map<String, Object> saveorders(@RequestBody OrdersDto ordersDto) {
			Orders orders = ordersService.SaveOrdersInfo(ordersDto);
			Map<String, Object> response = new HashMap<>();
			if (orders != null) {
				response.put("Status", HttpStatus.OK);
				response.put("Message", "Your Order Successful");
				response.put("Timestamp", new Date());
				return response;
			}
			response.put("Status", HttpStatus.BAD_REQUEST);
			response.put("Message", "Your Order is failed");
			response.put("Timestamp", new Date());
			return response;

		}

		@GetMapping("/getorderdetail")
		public List<Orders> getAllOrders() {
			return ordersService.getAllOrdersDetails();

		}
	}


