package com.PharmacyManagementSystem;

public class User {
    protected static String id;
    protected String name;
    protected Role role;
    protected String email;

    public enum Role {
        ADMIN,
        CASHIER,
        CUSTOMER;
    }


    public User() {}
    public User(String id, String name, Role role, String email) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.email = email;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
