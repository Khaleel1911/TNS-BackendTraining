package com.tnsif.fooddeliverysystem.entities;
import java.util.*;
public class Cart {
	private	Map<FoodItem,Integer> items=new HashMap<>();
	public Cart() {
		
	}
	
	public void addItem(FoodItem fooditem,int quantity) {
		items.put(fooditem, quantity);
	}
	public void removeItem(FoodItem fooditem) {
		items.remove(fooditem);
	}
	
	public Map<FoodItem,Integer> getItems() {
		return items;
		
	}

	@Override
	public String toString() {
		return "Cart [items=" + items + "]";
	}
}
