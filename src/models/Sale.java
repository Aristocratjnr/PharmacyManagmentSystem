package models;

import java.util.Date;

public class Sale {
    private int id;
    private int drugId;
    private Date date;
    private int quantity;

    // Constructor
    public Sale(int id, int drugId, Date date, int quantity) {
        this.id = id;
        this.drugId = drugId;
        this.date = date;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getDrugId() { return drugId; }
    public void setDrugId(int drugId) { this.drugId = drugId; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
