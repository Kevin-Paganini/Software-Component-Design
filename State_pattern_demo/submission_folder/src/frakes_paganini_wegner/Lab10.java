package frakes_paganini_wegner;/*
 * Course: CS2852-011
 * Fall 2021-2022
 * File header contains JavaFX Application frakes_paganini_wegner.Lab10
 * Name: frakes_paganini_wegner.Lab10
 * Created on 1/19/2022 at 10:31 AM
 */

/**
 * Main is responsible for instantiating a Window and loading the FXML file
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab10 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        primaryStage.setTitle("Chandler, Kevin, Michael's amazing Vehicle thing");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public Lab10() {
    }

    public static void main(String[] args) {
        launch(args);
    }
}
