package com.tnsif.fooddeliverysystem.entities;

public class Customer extends User{
		public Customer(int userId, String username, long contactNo) {
		super(userId, username, contactNo);
	}

		private Cart cart;
		
		public Cart getCart() {
			return cart;
			
		}
		public void setCart(Cart cart) {
		    this.cart = cart;
		}

		
}
