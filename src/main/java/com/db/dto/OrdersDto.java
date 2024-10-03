package com.db.dto;

public class OrdersDto {
		private long id;
		private long productId;
		private String productName;
		private double productPrice;
		private String orderDate;
		private String deliveryDate;
		private String deliveryLocation;
		private long customerId;
		public OrdersDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public OrdersDto(long id, long productId, String productName, double productPrice, String orderDate,
				String deliveryDate, String deliveryLocation, long customerId) {
			super();
			this.id = id;
			this.productId = productId;
			this.productName = productName;
			this.productPrice = productPrice;
			this.orderDate = orderDate;
			this.deliveryDate = deliveryDate;
			this.deliveryLocation = deliveryLocation;
			this.customerId = customerId;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public long getProductId() {
			return productId;
		}
		public void setProductId(long productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}
		public String getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}
		public String getDeliveryDate() {
			return deliveryDate;
		}
		public void setDeliveryDate(String deliveryDate) {
			this.deliveryDate = deliveryDate;
		}
		public String getDeliveryLocation() {
			return deliveryLocation;
		}
		public void setDeliveryLocation(String deliveryLocation) {
			this.deliveryLocation = deliveryLocation;
		}
		public long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}

		
	}


