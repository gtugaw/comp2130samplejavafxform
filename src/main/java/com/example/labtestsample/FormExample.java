package com.example.labtestsample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class FormExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // --- 1. Main VBox (Overall Form Container) ---
        VBox root = new VBox(20); // 20px spacing between elements
        root.setPadding(new Insets(25, 25, 25, 25));

        // --- 2. Title (Using Text) ---
        Text title = new Text("User Registration");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        // --- 3. GridPane (For Labeled Inputs) ---
        GridPane grid = new GridPane();
        grid.setHgap(10); // Horizontal gap
        grid.setVgap(10); // Vertical gap
        grid.setAlignment(Pos.CENTER);

        // Row 0: Name
        Label nameLabel = new Label("User Name:");
        TextField nameField = new TextField();
        grid.add(nameLabel, 0, 0); // Column 0, Row 0
        grid.add(nameField, 1, 0); // Column 1, Row 0

        // Row 1: Password
        Label passwordLabel = new Label("Password:");
        TextField passwordField = new TextField();
        grid.add(passwordLabel, 0, 1); // Column 0, Row 1
        grid.add(passwordField, 1, 1); // Column 1, Row 1

        // Row 2: Email (Example of an HBox in a GridPane cell)
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        HBox emailHBox = new HBox(5, emailField); // HBox with 5px spacing for the input
        grid.add(emailLabel, 0, 2); // Column 0, Row 2
        grid.add(emailHBox, 1, 2); // Column 1, Row 2

        // --- 4. HBox (For Buttons) ---
        Button submitBtn = new Button("Submit");
        Button cancelBtn = new Button("Cancel");

        HBox buttonHBox = new HBox(10); // 10px spacing between buttons
        buttonHBox.setAlignment(Pos.BOTTOM_RIGHT);
        buttonHBox.getChildren().addAll(cancelBtn, submitBtn);

        // --- 5. Final Assembly ---
        root.getChildren().addAll(title, grid, buttonHBox);

        // --- 6. Scene and Stage Setup ---
        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("JavaFX Form Test");
        stage.setScene(scene);
        stage.show();
    }
}
