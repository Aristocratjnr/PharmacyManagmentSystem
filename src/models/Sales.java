package models;

import java.util.Date;
import java.util.List;

public class Sales {
    private String saleId;
    private Date date;
    private List<Purchase> purchases;
    private double totalAmount;
    private Customer customer;

    // Constructor initializing the attributes
    public Sales(String saleId, Date date, List<Purchase> purchases, Customer customer) {
        this.saleId = saleId;
        this.date = date;
        this.purchases = purchases;
        this.customer = customer;
        this.totalAmount = calculateTotalAmount();
    }

    // Getters and setters
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
        this.totalAmount = calculateTotalAmount();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Calculate the total amount of the sale
    private double calculateTotalAmount() {
        return purchases.stream().mapToDouble(Purchase::getTotalAmount).sum();
    }

    // Override toString() method to provide a readable representation of the Sales object
    @Override
    public String toString() {
        return "Sales{" +
                "saleId='" + saleId + '\'' +
                ", date=" + date +
                ", totalAmount=" + totalAmount +
                ", customer=" + customer +
                ", purchases=" + purchases +
                '}';
    }
}
