
package models;

// The Supplier class has a constructor that initializes the attributes.

public class Supplier implements Comparable<Supplier> {
    private String supplierId;
    private String name;
    private String location;
  // The Supplier class has three attributes: supplierId, name, and location.

    public Supplier(String supplierId, String name, String location) {
        setSupplierId(supplierId);
        setName(name);
        setLocation(location);
        
    }

      // Getters and setters with validation

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        if (supplierId == null || supplierId.isEmpty()) {
            throw new IllegalArgumentException("Supplier ID cannot be null or empty");
        }
        this.supplierId = supplierId;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location == null || location.isEmpty()) {
            throw new IllegalArgumentException("Location cannot be null or empty");
        }
        this.location = location;
    }
 // Override toString() method to provide a readable representation of the Supplier objects

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    // Implement the Comparable interface to allow sorting by supplierId

    @Override
    public int compareTo(Supplier other) {
        return this.supplierId.compareTo(other.supplierId);
    }

    // Static factory method to create a Supplier object

    public static Supplier createSupplier(String supplierId, String name, String location) {
        return new Supplier(supplierId, name, location);
    }
  
   
  
}
