package com.example.christmaspresents.rest;

import com.example.christmaspresents.dto.Present;
import com.example.christmaspresents.dto.PresentsRequest;
import com.example.christmaspresents.dto.PresentsProducer;
import com.example.christmaspresents.model.Model;
import com.example.christmaspresents.readers.TextFileReader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private TextFileReader reader;
    private Model model;
    @FXML
    private Label priceLabel;
    @FXML
    private ComboBox producerComboBox;
    @FXML
    private ComboBox productComboBox;
    @FXML
    private CheckBox checkBox;
    @FXML
    public void buttonOnClick(ActionEvent actionEvent) {
        Present product = (Present)productComboBox.getValue();
        priceLabel.setText(product.getPrice() + "");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            reader = new TextFileReader();
            PresentsRequest request = reader.read("input.txt");
            ObservableList<PresentsProducer> optionsProducer = FXCollections.observableArrayList(
                    request.getProducers()
            );
            producerComboBox.setItems(optionsProducer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void onProducerComboBoxClicked(ActionEvent actionEvent){
        PresentsProducer producer = (PresentsProducer)producerComboBox.getValue();
        ObservableList<Present> optionsProducer = FXCollections.observableArrayList(
                producer.getPresents()
        );
        productComboBox.setItems(optionsProducer);
    }
}