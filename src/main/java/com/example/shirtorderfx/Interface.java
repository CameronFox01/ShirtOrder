package com.example.shirtorderfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Interface extends Application {

    @Override
    public void start(Stage stage) {
        //Image Icon Create
        Image icon = new Image(getClass().getResource("/shirtIcon.png").toExternalForm());

        // Main Area
        Label enterTitle = new Label("Enter List");
        enterTitle.setFont(new Font(50));

        Label genderedSizes = new Label("Gendered Sizes");
        genderedSizes.setFont(new Font(50));

        Label unisexLabel = new Label("Unisex Sizes");
        unisexLabel.setFont(new Font(50));

        // Use TextArea for multiline input
        TextArea textArea = new TextArea();
        textArea.setMaxWidth(200);
        textArea.setPrefHeight(400); // Set preferred height for the TextArea

        // TextArea to display results for Gendered Sizes
        TextArea genderedResults = new TextArea();
        genderedResults.setFont(new Font(20));
        genderedResults.setMaxWidth(200);
        genderedResults.setPrefHeight(405);
        genderedResults.setEditable(false); // Make it non-editable

        TextArea unisexResults = new TextArea();
        unisexResults.setFont(new Font(20));
        unisexResults.setMaxWidth(200);
        unisexResults.setPrefHeight(405);
        unisexResults.setEditable(false);

        Button enterButton = new Button("Enter");
        enterButton.setMinSize(100, 100);

        enterButton.setOnAction(e -> {
            String[] items = textArea.getText().split("\n");
            for(int i = 0; i < items.length; i ++){
                items[i] = items[i].toUpperCase();
            }
            String result = Math.genderProcess(items);
            genderedResults.setText(result); // Display the result in the genderedResults
            result = Math.unisexProcess(items);
            System.out.println(result);
        });

        //Vbox for Enter Side
        VBox enterBox = new VBox(50, enterTitle, textArea);
        enterBox.setAlignment(Pos.CENTER);

        VBox resultsBox = new VBox(50, genderedSizes, genderedResults);
        resultsBox.setAlignment(Pos.CENTER);

        HBox mainBox = new HBox(250, enterBox, enterButton, resultsBox);
        mainBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(mainBox);
        // Get the primary screen
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        // Set the stage size to the screen dimensions
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());

        // Calculate the centered position
        double centerX = bounds.getMinX() + (bounds.getWidth() - stage.getWidth()) / 2;
        double centerY = bounds.getMinY() + (bounds.getHeight() - stage.getHeight()) / 2;
        stage.setX(centerX);
        stage.setY(centerY);
        stage.setTitle("SizeCounter");
        stage.setScene(scene);
        stage.getIcons().add(icon);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}