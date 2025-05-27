package com.tnsif.fooddeliverysystem.application;

import java.util.*;

import com.tnsif.fooddeliverysystem.entities.*;
import com.tnsif.fooddeliverysystem.services.*;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        FoodService foodService = new FoodService();
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService();

        Map<Integer, Cart> customerCarts = new HashMap<>();
        Map<Integer, List<Order>> customerOrders = new HashMap<>();

        int mainChoice, adminChoice, customerChoice;

        while (true) {
            System.out.println("\n1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            mainChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (mainChoice) {
                case 1:
                    while (true) {
                        System.out.println("\nAdmin Menu:");
                        System.out.println("1. Add Restaurant");
                        System.out.println("2. Add Food Item to Restaurant");
                        System.out.println("3. Remove Food Item from Restaurant");
                        System.out.println("4. View Restaurants and Menus");
                        System.out.println("5. View Orders");
                        System.out.println("6. Add Delivery Person");
                        System.out.println("7. Assign Delivery Person to Order");
                        System.out.println("8. Exit");
                        System.out.print("Choose an option: ");
                        adminChoice = scanner.nextInt();
                        scanner.nextLine(); // consume newline

                        if (adminChoice == 8) {
                            System.out.println("Returning to main menu...\n");
                            break;
                        }

                        switch (adminChoice) {
                            case 1: // Add Restaurant
                                System.out.print("Enter Restaurant Id: ");
                                int rid = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter Restaurant Name: ");
                                String rname = scanner.nextLine();
                                Restaurant robj = new Restaurant(rid, rname, new ArrayList<>());
                                foodService.addRestaurant(robj);
                                System.out.println("Restaurant added successfully");
                                break;

                            case 2: // Add Food Item to Restaurant
                                System.out.print("Enter Restaurant Id: ");
                                int restIdForAdd = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter Food Item Id: ");
                                int foodId = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter Food Name: ");
                                String foodName = scanner.nextLine();
                                System.out.print("Enter Food Price: ");
                                double price = scanner.nextDouble();
                                scanner.nextLine();
                                FoodItem newFood = new FoodItem(foodId, foodName, price);
                                foodService.addFoodItemToRestaurant(restIdForAdd, newFood);
                                System.out.println("Food item added to restaurant.");
                                break;

                            case 3: // Remove Food Item from Restaurant
                                System.out.print("Enter Restaurant Id: ");
                                int restIdForRemove = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter Food Item index to remove (starting at 0): ");
                                int foodIndex = scanner.nextInt();
                                scanner.nextLine();
                                foodService.removeFoodItemFromRestaurant(restIdForRemove, foodIndex);
                                System.out.println("Food item removed from restaurant.");
                                break;

                            case 4: // View Restaurants and Menus
                                List<Restaurant> restaurants = foodService.getRestaurants();
                                if (restaurants.isEmpty()) {
                                    System.out.println("No restaurants available.");
                                } else {
                                    for (Restaurant r : restaurants) {
                                        System.out.println(r);
                                    }
                                }
                                break;

                            case 5: // View Orders
                                List<Order> allOrders = orderService.getOrders();
                                if (allOrders.isEmpty()) {
                                    System.out.println("No orders placed yet.");
                                } else {
                                    for (Order o : allOrders) {
                                        System.out.println(o);
                                    }
                                }
                                break;

                            case 6: // Add Delivery Person
                                System.out.print("Enter Delivery Person Id: ");
                                int dpId = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter Delivery Person Name: ");
                                String dpName = scanner.nextLine();
                                System.out.print("Enter Delivery Person Contact No: ");
                                long dpContact = scanner.nextLong();
                                scanner.nextLine();
                                DeliveryPerson dp = new DeliveryPerson(dpId, dpName, dpContact);
                                orderService.addDeliveryPerson(dp);
                                System.out.println("Delivery person added.");
                                break;

                            case 7: // Assign Delivery Person to Order
                                System.out.print("Enter Order Id: ");
                                int orderId = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter Delivery Person Id: ");
                                int deliveryPersonId = scanner.nextInt();
                                scanner.nextLine();
                                orderService.assignDeliveryPersonToOrder(orderId, deliveryPersonId);
                                break;

                            default:
                                System.out.println("Invalid admin choice.");
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\nCustomer Menu:");
                        System.out.println("1. Add Customer");
                        System.out.println("2. View Food Items");
                        System.out.println("3. Add Food to Cart");
                        System.out.println("4. View Cart");
                        System.out.println("5. Place Order");
                        System.out.println("6. View Orders");
                        System.out.println("7. Exit");
                        System.out.print("Choose an option: ");
                        customerChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (customerChoice == 7) {
                            System.out.println("Returning to main menu...\n");
                            break;
                        }

                        switch (customerChoice) {
                            case 1: // Add Customer
                                System.out.print("Enter Customer User Id: ");
                                int custId = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter Customer Username: ");
                                String custName = scanner.nextLine();
                                System.out.print("Enter Customer Contact Number: ");
                                long custContact = scanner.nextLong();
                                scanner.nextLine();
                                Customer customer = new Customer(custId, custName, custContact);
                                customer.setCart(new Cart()); // Add setter for cart or initialize properly
                                customerService.addCustomer(customer);
                                customerCarts.put(custId, customer.getCart());
                                customerOrders.put(custId, new ArrayList<>());
                                System.out.println("Customer added.");
                                break;

                            case 2: // View Food Items
                                List<FoodItem> allFoodItems = foodService.getAllFoodItems();
                                if (allFoodItems.isEmpty()) {
                                    System.out.println("No food items available.");
                                } else {
                                    for (FoodItem fi : allFoodItems) {
                                        System.out.println(fi);
                                    }
                                }
                                break;

                            case 3: // Add Food to Cart
                                System.out.print("Enter Customer User Id: ");
                                int userIdForCart = scanner.nextInt();
                                scanner.nextLine();
                                Cart cart = customerCarts.get(userIdForCart);
                                if (cart == null) {
                                    System.out.println("Customer not found or cart not initialized.");
                                    break;
                                }
                                System.out.print("Enter Food Item Id to add: ");
                                int foodIdToAdd = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter Quantity: ");
                                int qty = scanner.nextInt();
                                scanner.nextLine();

                                FoodItem foodToAdd = null;
                                // Find the FoodItem by id
                                for (FoodItem fi : foodService.getAllFoodItems()) {
                                    if (fi.getId() == foodIdToAdd) {
                                        foodToAdd = fi;
                                        break;
                                    }
                                }
                                if (foodToAdd != null) {
                                    cart.addItem(foodToAdd, qty);
                                    System.out.println("Food item added to cart.");
                                } else {
                                    System.out.println("Food item not found.");
                                }
                                break;

                            case 4: // View Cart
                                System.out.print("Enter Customer User Id: ");
                                int userIdForViewCart = scanner.nextInt();
                                scanner.nextLine();
                                Cart viewCart = customerCarts.get(userIdForViewCart);
                                if (viewCart == null || viewCart.getItems().isEmpty()) {
                                    System.out.println("Cart is empty or customer not found.");
                                } else {
                                    System.out.println("Cart Items:");
                                    for (Map.Entry<FoodItem, Integer> entry : viewCart.getItems().entrySet()) {
                                        System.out.println(entry.getKey() + " Quantity: " + entry.getValue());
                                    }
                                }
                                break;

                            case 5: // Place Order
                                System.out.print("Enter Customer User Id: ");
                                int userIdForOrder = scanner.nextInt();
                                scanner.nextLine();
                                Cart placeOrderCart = customerCarts.get(userIdForOrder);
                                if (placeOrderCart == null || placeOrderCart.getItems().isEmpty()) {
                                    System.out.println("Cart is empty or customer not found.");
                                    break;
                                }
                                Customer orderCustomer = null;
                                for (Customer c : customerService.getCustomers()) {
                                    if (c.getUserId() == userIdForOrder) {
                                        orderCustomer = c;
                                        break;
                                    }
                                }
                                if (orderCustomer == null) {
                                    System.out.println("Customer not found.");
                                    break;
                                }
                                System.out.print("Enter Delivery Address: ");
                                String deliveryAddress = scanner.nextLine();
                                
                                // Create order with a unique orderId
                                int orderIdCount = orderService.getOrders().size() + 1;
                                Order order = new Order(orderIdCount, orderCustomer);
                                for (Map.Entry<FoodItem, Integer> entry : placeOrderCart.getItems().entrySet()) {
                                    order.addItem(entry.getKey(), entry.getValue());
                                }
                                order.setStatus("Placed");
                                order.setDeliveryAddress(deliveryAddress);
                                orderService.placeOrder(order);
                                // Clear customer's cart after placing order
                                placeOrderCart.getItems().clear();

                                // Keep track of customer's orders
                                customerOrders.get(userIdForOrder).add(order);

                                System.out.println("Order placed successfully with Order ID: " + orderIdCount);
                                break;

                            case 6: // View Orders
                                System.out.print("Enter Customer User Id: ");
                                int userIdForOrders = scanner.nextInt();
                                scanner.nextLine();
                                List<Order> ordersOfCustomer = customerOrders.get(userIdForOrders);
                                if (ordersOfCustomer == null || ordersOfCustomer.isEmpty()) {
                                    System.out.println("No orders found for this customer.");
                                } else {
                                    for (Order o : ordersOfCustomer) {
                                        System.out.println(o);
                                    }
                                }
                                break;

                            default:
                                System.out.println("Invalid customer choice.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting application...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
