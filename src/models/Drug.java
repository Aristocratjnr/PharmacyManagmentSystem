package models;
// The Drug class has a constructor that initializes the attributes.
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Drug implements Serializable, Comparable<Drug> {
    private static final long serialVersionUID = 1L;

    private String drugCode;
    private String name;
    private String description;
    private int stock;
    private double price;
    private List<Supplier> suppliers;
    
     // A Constructor with validation
     public Drug(String drugCode, String name, String description, int stock, double price) {
        setDrugCode(drugCode);
        setName(name);
        setDescription(description);
        setStock(stock);
        setPrice(price);
        this.suppliers = new ArrayList<>();
    }

    // Getters and Setters with validation
    public String getDrugCode() {
        return drugCode;
    }
    public void setDrugCode(String drugCode) {
        if (drugCode == null || drugCode.isEmpty()) {
            throw new IllegalArgumentException("Drug code cannot be null or empty");
        }
        this.drugCode = drugCode;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        if (suppliers == null) {
            throw new IllegalArgumentException("Suppliers list cannot be null");
        }
        this.suppliers = suppliers;
    }

    // Method to add a supplier
    public void addSupplier(Supplier supplier) {
        if (supplier != null && !suppliers.contains(supplier)) {
            suppliers.add(supplier);
        }
    }

    // Method to remove a supplier
    public void removeSupplier(Supplier supplier) {
        suppliers.remove(supplier);
    }

    // Methods to increase and decrease stock
    public void increaseStock(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to increase cannot be negative");
        }
        this.stock += amount;
    }

    public void decreaseStock(int amount) {
        if (amount < 0 || amount > stock) {
            throw new IllegalArgumentException("Amount to decrease is invalid");
        }
        this.stock -= amount;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Drug{" +
                "drugCode='" + drugCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", suppliers=" + suppliers +
                '}';
    }

   
