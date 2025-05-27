package com.tnsif.fooddeliverysystem.services;
import com.tnsif.fooddeliverysystem.entities.FoodItem;
import com.tnsif.fooddeliverysystem.entities.Restaurant;
import java.util.*;

public class FoodService {
	private List<Restaurant> restaurants=new ArrayList<>();
	public void addRestaurant(Restaurant restaurant)
{
	restaurants.add(restaurant);
}
	
	public List<Restaurant> getRestaurants(){ return restaurants;}
	
	public List<FoodItem> getAllFoodItems(){
		List<FoodItem> allFoodItems=new ArrayList<>();
		for(Restaurant restaurant:restaurants) {
			allFoodItems.addAll(restaurant.getMenu());
		}
		return allFoodItems;
	}
	public void addFoodItemToRestaurant(int restaurantId,FoodItem foodItem) {
		    for (Restaurant restaurant : restaurants) {
		        if (restaurant.getId() == restaurantId) {
		            restaurant.addFoodItem(foodItem);
		            return;
		        }
		    }
		    System.out.println("Restaurant with ID " + restaurantId + " not found.");
		}

	public void removeFoodItemFromRestaurant(int restaurantId,int foodItemId) {
		for (Restaurant restaurant : restaurants) {
	        if (restaurant.getId() == restaurantId) {
	            restaurant.removeFoodItem(foodItemId);
	            return;
	        }
	    }
	    System.out.println("Restaurant with ID " + restaurantId + " not found.");
	}
}
