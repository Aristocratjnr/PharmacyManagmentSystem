//Liezah commits
package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private String customerId;
    private String name;
    private String contactInfo;
    private String address;
    private int loyaltyPoints;
    private List<String> orderHistory;

    // The Customer class has several attributes: customerId, name, contactInfo, address, loyaltyPoints, and orderHistory.

    public Customer(String name, String contactInfo, String address) {
        this.customerId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        this.address = address;
        this.loyaltyPoints = 0;
        this.orderHistory = new ArrayList<>();
    }

    // Getters and setters with validation

    public String getCustomerId() {
        return customerId;
    }

    private void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        if (contactInfo == null || contactInfo.isEmpty()) {
            throw new IllegalArgumentException("Contact information cannot be null or empty");
        }
        this.contactInfo = contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty");
        }
        this.address = address;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int points) {
        if (points < 0) {
            throw new IllegalArgumentException("Points cannot be negative");
        }
        this.loyaltyPoints += points;
    }

    public List<String> getOrderHistory() {
        return orderHistory;
    }

    public void addOrderToHistory(String orderId) {
        if (orderId == null || orderId.isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        this.orderHistory.add(orderId);
    }

    // Method to generate a unique customer ID

    private String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

    // Override toString() method to provide a readable representation of the Customer object

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", address='" + address + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                ", orderHistory=" + orderHistory +
                '}';
    }
}
