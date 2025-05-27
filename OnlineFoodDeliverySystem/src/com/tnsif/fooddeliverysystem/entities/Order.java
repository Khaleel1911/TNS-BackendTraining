package com.tnsif.fooddeliverysystem.entities;
import java.util.*;
public class Order {
	private int orderId;
	private Customer customer;
	private Map<FoodItem,Integer> items=new HashMap<>();
	private String status;
	private DeliveryPerson deliveryperson;
	private String deliveryAddress;
	public Order(int orderId, Customer customer) {
		this.orderId = orderId;
		this.customer = customer;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map<FoodItem, Integer> getItems() {
		return items;
	}
	public void setItems(Map<FoodItem, Integer> items) {
		this.items = items;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public DeliveryPerson getDeliveryperson() {
		return deliveryperson;
	}
	public void setDeliveryperson(DeliveryPerson deliveryperson) {
		this.deliveryperson = deliveryperson;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", items=" + items + ", status=" + status
				+ ", deliveryperson=" + deliveryperson + ", deliveryAddress=" + deliveryAddress + "]";
	}
	
	public void addItem(FoodItem fooditem,int quantity) {
		items.put(fooditem, quantity);
	}
}
