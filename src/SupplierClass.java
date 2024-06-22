
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

  
  
}
