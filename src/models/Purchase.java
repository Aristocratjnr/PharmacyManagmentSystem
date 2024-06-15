package models;
// The Purchase class has a constructor that initializes the attributes.

import java.util.Date;

public class Purchase {
    private Date date;
    private String drugCode;
    private int quantity;
    private double totalAmount;
    private Customer customer;

    public Purchase(Date date, String drugCode, int quantity, double totalAmount, Customer customer) {
        this.date = date;
        this.drugCode = drugCode;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.customer = customer;
    }

    // Getters and setters

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
