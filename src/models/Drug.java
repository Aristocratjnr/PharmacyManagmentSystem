package models;
// The Drug class has a constructor that initializes the attributes.
import java.util.List;

public class Drug {
    private String drugCode;
    private String name;
    private String description;
    private int stock;
    private double price;
    private List<Supplier> suppliers;

    public Drug(String drugCode, String name, String description, int stock, double price) {
        this.drugCode = drugCode;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    // Getters and setters

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}
