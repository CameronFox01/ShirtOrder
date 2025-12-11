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

        Label resultTitle = new Label("Results");
        resultTitle.setFont(new Font(50));

        // Use TextArea for multiline input
        TextArea textArea = new TextArea();
        textArea.setMaxWidth(200);
        textArea.setPrefHeight(400); // Set preferred height for the TextArea

        // TextArea to display results
        TextArea resultArea = new TextArea();
        resultArea.setFont(new Font(20));
        resultArea.setMaxWidth(200);
        resultArea.setPrefHeight(405);
        resultArea.setEditable(false); // Make it non-editable

        Button enterButton = new Button("Enter");
        enterButton.setMinSize(100, 100);

        enterButton.setOnAction(e -> {
            String[] items = textArea.getText().split("\n");
            String result = Math.process(items);
            resultArea.setText(result); // Display the result in the resultArea
        });

        //Vbox for Enter Side
        VBox enterBox = new VBox(50, enterTitle, textArea);
        enterBox.setAlignment(Pos.CENTER);

        VBox resultsBox = new VBox(50, resultTitle, resultArea);
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