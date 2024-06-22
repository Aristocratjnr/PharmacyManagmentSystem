package Main;

//Graphical User Interface for the Pharmacy Management System
//This is the GUIas

import java.awt.Button;
import java.awt.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import models.Drug;


public class GUI extends Application {
    PharmacyManagementSystem pms = new PharmacyManagementSystem();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pharmacy Management System");

        // Create the GridPane
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Add Drug Code input
        Label drugCodeLabel = new Label("Drug Code:");
        grid.add(drugCodeLabel, 0, 0);
        TextField drugCodeField = new TextField();
        grid.add(drugCodeField, 1, 0);

        // Add Drug Name input
        Label drugNameLabel = new Label("Drug Name:");
        grid.add(drugNameLabel, 0, 1);
        TextField drugNameField = new TextField();
        grid.add(drugNameField, 1, 1);

        // Add Drug Description input
        Label drugDescLabel = new Label("Description:");
        grid.add(drugDescLabel, 0, 2);
        TextField drugDescField = new TextField();
        grid.add(drugDescField, 1, 2);

        // Add Drug Stock input
        Label drugStockLabel = new Label("Stock:");
        grid.add(drugStockLabel, 0, 3);
        TextField drugStockField = new TextField();
        grid.add(drugStockField, 1, 3);

        // Add Drug Price input
        Label drugPriceLabel = new Label("Price:");
        grid.add(drugPriceLabel, 0, 4);
        TextField drugPriceField = new TextField();
        grid.add(drugPriceField, 1, 4);

        // Add Button
        Button addButton = new Button("Add Drug");
        grid.add(addButton, 1, 5);

        addButton.setOnAction(event -> {
            String drugCode = drugCodeField.getText();
            String drugName = drugNameField.getText();
            String drugDescription = drugDescField.getText();
            int drugStock = Integer.parseInt(drugStockField.getText());
            double drugPrice = Double.parseDouble(drugPriceField.getText());

            Drug drug = new Drug(drugCode, drugName, drugDescription, drugStock, drugPrice);
            pms.addDrug(drug);

            // Clear fields after adding
            drugCodeField.clear();
            drugNameField.clear();
            drugDescField.clear();
            drugStockField.clear();
            drugPriceField.clear();
        });

        // Set the Scene
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
