package main;

import models.Drug;

public class Main {
    public static void main(String[] args) {
        PharmacyManagementSystem pms = new PharmacyManagementSystem();

        // Example usage
        Drug drug = new Drug("D001", "Aspirin", "Pain reliever", 100, 5.99);
        pms.addDrug(drug);

        // Add more logic to handle user interactions
    }
}
