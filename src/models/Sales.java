package models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sales implements Serializable {
    private static final Logger LOGGER = Logger.getLogger(Sales.class.getName());

    private String saleId;
    private Date date;
    private List<Purchase> purchases;
    private double totalAmount;
    private double discount;
    private double tax;
    private Customer customer;

    // Constructor initializing the attributes
    public Sales(Date date, List<Purchase> purchases, Customer customer, double discount, double tax) {
        this.saleId = generateUniqueId();
        this.date = date;
        this.purchases = purchases;
        this.customer = customer;
        this.discount = discount;
        this.tax = tax;
        this.totalAmount = calculateTotalAmount();
        LOGGER.log(Level.INFO, "Sale created: " + this.toString());
    }

    // Getters and setters
    public String getSaleId() {
        return saleId;
    }

    private void setSaleId(String saleId) {
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

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
        this.totalAmount = calculateTotalAmount();
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
        this.totalAmount = calculateTotalAmount();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Calculate the total amount of the sale after discount and tax
    private double calculateTotalAmount() {
        double subtotal = purchases.stream().mapToDouble(Purchase::getTotalAmount).sum();
        double totalAfterDiscount = subtotal - discount;
        return totalAfterDiscount + (totalAfterDiscount * tax / 100);
    }

    // Method to generate a unique sale ID
    private String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

    // Override toString() method to provide a readable representation of the Sales
    // object
    @Override
    public String toString() {
        return "Sales{" +
                "saleId='" + saleId + '\'' +
                ", date=" + date +
                ", totalAmount=" + totalAmount +
                ", discount=" + discount +
                ", tax=" + tax +
                ", customer=" + customer +
                ", purchases=" + purchases +
                '}';
    }
}
