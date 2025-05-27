package com.tnsif.fooddeliverysystem.entities;

import java.util.*;
public class Restaurant {
	private int Id;
	private String name;
	
	private List<FoodItem> menu=new ArrayList<>();

	public Restaurant(int id, String name, List<FoodItem> menu) {
		super();
		Id = id;
		this.name = name;
		this.menu = menu;
	}
	

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public List<FoodItem> getMenu() {
		return menu;
	}

	@Override
	public String toString() {
		return "Restaurant [Id=" + Id + ", name=" + name + ", menu=" + menu + "]";
	}
	public void addFoodItem(FoodItem item) {
		menu.add(item);
	}
	public void removeFoodItem(int index) {
		menu.remove(index);
	}
}
