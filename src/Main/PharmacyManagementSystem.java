package Main;
// The PharmacyManagementSystem class has a constructor that initializes the attributes.

import models.Drug;
import Utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

// The PharmacyManagementSystem class has two attributes: drugs and connection.

public class PharmacyManagementSystem {
    private HashMap<String, Drug> drugs;
    private Connection connection;

    public PharmacyManagementSystem() {
        this.drugs = new HashMap<>();
        this.connection = DatabaseConnection.getConnection();
    }

    public void addDrug(Drug drug) {
        drugs.put(drug.getDrugCode(), drug);
        String sql = "INSERT INTO Drugs (drugCode, name, description, stock, price) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, drug.getDrugCode());
            pstmt.setString(2, drug.getName());
            pstmt.setString(3, drug.getDescription());
            pstmt.setInt(4, drug.getStock());
            pstmt.setDouble(5, drug.getPrice());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Drug searchDrug(String drugCode) {
        return drugs.get(drugCode);
    }

    // Other methods (viewAllDrugs, viewPurchaseHistory, etc.)
}
