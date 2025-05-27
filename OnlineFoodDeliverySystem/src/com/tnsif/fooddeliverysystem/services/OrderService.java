package com.tnsif.fooddeliverysystem.services;

import java.util.*;

import com.tnsif.fooddeliverysystem.entities.DeliveryPerson;
import com.tnsif.fooddeliverysystem.entities.Order;
public class OrderService {
	private List<Order> orders=new ArrayList<>();
	private List<DeliveryPerson> deliveryPersons=new ArrayList<>();
	
	public void placeOrder(Order order) {
		orders.add(order);
	}
	public List<Order> getOrders(){
		return orders;
	}
	
	public void addDeliveryPerson(DeliveryPerson deliveryPerson) {
		deliveryPersons.add(deliveryPerson);
	}
	public List<DeliveryPerson> getDeliveryPersons(){
		return deliveryPersons;
		
	}
	
	public void assignDeliveryPersonToOrder(int orderId, int deliveryPersonId) {
	    Order foundOrder = null;
	    DeliveryPerson foundDeliveryPerson = null;

	    for (Order order : orders) {
	        if (order.getOrderId() == orderId) {
	            foundOrder = order;
	            break;
	        }
	    }

	    for (DeliveryPerson dp : deliveryPersons) {
	        if (dp.getDeliveryPesonId() == deliveryPersonId) { 
	            foundDeliveryPerson = dp;
	            break;
	        }
	    }
	    if (foundOrder != null && foundDeliveryPerson != null) {
	        foundOrder.setDeliveryperson(foundDeliveryPerson);
	        foundOrder.setStatus("Assigned");
	        System.out.println("Delivery person " + foundDeliveryPerson.getName() + " assigned to Order ID: " + orderId);
	    } else {
	        System.out.println("Order or Delivery Person not found.");
	    }
	}

	
}
