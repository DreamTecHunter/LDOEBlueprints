package com.gaming.ldoeblueprints;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class IndexController implements Initializable {
    @FXML
    private HBox topHBox, bottomHBox;
    @FXML
    private VBox leftBox, rightVBox;
    @FXML
    private ImageView centerImageView;
    @FXML
    private Button previousButton, nextButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}