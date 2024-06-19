package Main;
// This is main
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import models.Drug;


public class Main extends Application {
    PharmacyManagementSystem pms = new PharmacyManagementSystem();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pharmacy Management System");

        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(20));
        grid.setAlignment(Pos.CENTER);

        Label drugCodeLabel = new Label("Drug Code:");
        grid.add(drugCodeLabel, 0, 0);
        TextField drugCodeField = new TextField();
        grid.add(drugCodeField, 1, 0);

        Label drugNameLabel = new Label("Drug Name:");
        grid.add(drugNameLabel, 0, 1);
        TextField drugNameField = new TextField();
        grid.add(drugNameField, 1, 1);

        Label drugDescLabel = new Label("Description:");
        grid.add(drugDescLabel, 0, 2);
        TextField drugDescField = new TextField();
        grid.add(drugDescField, 1, 2);

        Label drugStockLabel = new Label("Stock:");
        grid.add(drugStockLabel, 0, 3);
        TextField drugStockField = new TextField();
        grid.add(drugStockField, 1, 3);

        Label drugPriceLabel = new Label("Price:");
        grid.add(drugPriceLabel, 0, 4);
        TextField drugPriceField = new TextField();
        grid.add(drugPriceField, 1, 4);

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

            drugCodeField.clear();
            drugNameField.clear();
            drugDescField.clear();
            drugStockField.clear();
            drugPriceField.clear();
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
