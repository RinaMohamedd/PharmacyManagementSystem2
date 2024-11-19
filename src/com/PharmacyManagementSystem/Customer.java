package com.PharmacyManagementSystem;

import java.util.ArrayList;

public class Customer extends User{
    private ArrayList<Cart> orderHistory;
    private static int n = 0;

    public Customer() {}

    public Customer(String name, String email) {
        super(name, Role.CUSTOMER, email);
        id = generateId();
        orderHistory = new ArrayList<>();
    }

    //something wrong here
    public ArrayList<Cart> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(Cart order) {
        orderHistory.add(order);
    }

    public void removeOrder(Cart order) {
        orderHistory.remove(order);
    }

    //something wrong here
    public void viewOrderDetails() {
        int index = 1;
        for(Cart order: orderHistory) {
            System.out.println("Order(" + index + ") details:");
            System.out.print("ID: ");
            String h = order.getId();
            System.out.println(h);
            order.printProductlist();
            System.out.println("Total Price: " + order.getTotalPrice());
            System.out.println("Order Date: " + order.getOrderDate());
            index++;
        }
        // Here you would implement logic to display order details
        //System.out.println("Order Details: " + order.toString());
    }

    public void rateOrder(Cart order, int rating) {
        System.out.println("Rating for order " + order.getId() + ": " + rating);
    }

    public void displayOrderHistory() {
        System.out.println("Order History for " + name + ":");
        for (Cart order : orderHistory) {
            System.out.println(order.toString());
        }
    }

    private String generateId() {
        String Id = "Customer_" + n;
        n++;
        return Id;
    }
}
