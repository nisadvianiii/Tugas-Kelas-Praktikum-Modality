package com.example.p03_2072051;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagementApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ManagementApp.class.getResource("Barang-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 415);
        stage.setTitle("Data Barang");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }


}
