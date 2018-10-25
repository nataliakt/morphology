package br.natalia.morphology.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DashboardController {

    @FXML
    private FlowPane imageFlowPane;

    @FXML
    private void initialize() {

    }

    @FXML
    private void handleOpenButton() throws IOException {
        FileChooser chooser = new FileChooser();
        File file = chooser.showOpenDialog(null);

        if (file != null) {
            Image image = new Image(file.toURI().toString());
            open(image);
        }
    }

    public void open(Image image) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/image.fxml"));
        AnchorPane root = loader.load();

        ImageController imageController = loader.getController();
        imageController.setImage(image);
        imageController.setDashboardController(this);

        imageFlowPane.getChildren().add(root);
    }

    public void remove(AnchorPane anchorPane) {
        imageFlowPane.getChildren().remove(anchorPane);
    }

}
