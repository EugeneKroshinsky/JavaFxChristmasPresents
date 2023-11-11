package com.example.christmaspresents;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller {
    private Model model;
    @FXML
    private Label priceLabel;
    @FXML
    public ComboBox productComboBox;
    @FXML
    public ComboBox producerComboBox;
    @FXML
    public void buttonOnClick(ActionEvent actionEvent) {
        priceLabel.setText("Hihihihiih");
    }
}