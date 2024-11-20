package com.PharmacyManagementSystem;

import java.time.LocalDate;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    private Supplier supplier;
    private LocalDate expirationDate;
    private static int n = 0;


    public Product() {}
    public Product(String name, double price, int quantity, Supplier supplier, LocalDate expirationDate) {
        productId = generateId();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.supplier = supplier;
        this.expirationDate = expirationDate;
    }


    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Supplier getSuppliers() {
        return supplier;
    }
    public void setSuppliers(Supplier supplier) {
        this.supplier = supplier;
    }

    public void addProduct(int productId, int quantity, String name) {
        this.productId += productId;
        this.quantity += quantity;
        this.name = name;
    }

    public void increaseStock(int quantity) {
        this.quantity += quantity;
    }

    public void reduceStock(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Not enough stock to be reduced");
        }
    }

    public boolean isInStock() {
        return this.quantity != 0;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + quantity);
        System.out.println("Supplier: " + supplier.getName());
        System.out.println("Expiration Date: " + expirationDate);
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    private String generateId() {
        String Id = "Product_" + n;
        n++;
        return Id;
    }
}
