package br.natalia.morphology;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        nu.pattern.OpenCV.loadShared();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/dashboard.fxml"));
        AnchorPane root = loader.load();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
