package models;

// The Supplier class has a constructor that initializes the attributes.

public class Supplier {
    private String supplierId;
    private String name;
    private String location;

    // The Supplier class has three attributes: supplierId, name, and location.

    public Supplier(String supplierId, String name, String location) {
        this.supplierId = supplierId;
        this.name = name;
        this.location = location;
    }

    // Getters and setters

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
