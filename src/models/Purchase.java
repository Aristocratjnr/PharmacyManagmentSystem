//Abigail Commit
package models;

import java.util.Date;

public class Purchase implements Comparable<Purchase> {
    private Date date;
    private String drugCode;
    private int quantity;
    private double totalAmount;
    private Customer customer;

    // The Purchase class has five attributes: date, drugCode, quantity, totalAmount, and customer.

    public Purchase(Date date, String drugCode, int quantity, double totalAmount, Customer customer) {
        setDate(date);
        setDrugCode(drugCode);
        setQuantity(quantity);
        setTotalAmount(totalAmount);
        setCustomer(customer);
    }

    // Getters and setters with validation

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        this.date = date;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        if (drugCode == null || drugCode.isEmpty()) {
            throw new IllegalArgumentException("Drug code cannot be null or empty");
        }
        this.drugCode = drugCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        if (totalAmount < 0) {
            throw new IllegalArgumentException("Total amount cannot be negative");
        }
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        this.customer = customer;
    }

    // Override toString() method to provide a readable representation of the Purchase objects

    @Override
    public String toString() {
        return "Purchase{" +
                "date=" + date +
                ", drugCode='" + drugCode + '\'' +
                ", quantity=" + quantity +
                ", totalAmount=" + totalAmount +
                ", customer=" + customer +
                '}';
    }

    // Implement the Comparable interface to allow sorting by date or totalAmount

    @Override
    public int compareTo(Purchase other) {
        return this.date.compareTo(other.date);
    }

    // Static factory method to create a Purchase object

    public static Purchase createPurchase(Date date, String drugCode, int quantity, double totalAmount, Customer customer) {
        return new Purchase(date, drugCode, quantity, totalAmount, customer);
    }

    // Method to calculate the total amount based on quantity and a unit price

    public void calculateTotalAmount(double unitPrice) {
        if (unitPrice < 0) {
            throw new IllegalArgumentException("Unit price cannot be negative");
        }
        this.totalAmount = this.quantity * unitPrice;
    }
}
