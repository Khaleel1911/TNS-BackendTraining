package com.tnsif.fooddeliverysystem.services;
import com.tnsif.fooddeliverysystem.entities.*;
import java.util.*;
public class CustomerService{
		private List<Customer> customerList=new ArrayList<>();
		
		public void addCustomer(Customer customer) {
			customerList.add(customer);
		}
		
		public Customer getCustomer(int userId) {
			return customerList.get(userId);		
		}
		
		public List<Customer> getCustomers(){
			return customerList;
			
		}
		
}
