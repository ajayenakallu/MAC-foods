package com.macfoods.dto;

public class Orders {

	private int orderId;
	private int userId;
	private int restaurantId;
	private float totalAmount;
	private String status;
	private String paymentOption;
	
	
	public Orders(int orderId, int userId, int restaurantId, float totalAmount, String status, String paymentOption) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.totalAmount = totalAmount;
		this.status = status;
		this.paymentOption = paymentOption;
	}
	
	public Orders( int userId, int restaurantId, float totalAmount, String status, String paymentOption) {
		super();
		
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.totalAmount = totalAmount;
		this.status = status;
		this.paymentOption = paymentOption;
	}
	
	public Orders() {
		
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	
     @Override
    public String toString() {
    	
    	return orderId+" "+userId+" "+restaurantId+" "+totalAmount+" "
    			+status+" "+paymentOption;
    }

}
