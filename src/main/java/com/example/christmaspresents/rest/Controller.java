package com.example.christmaspresents.rest;

import com.example.christmaspresents.dto.Present;
import com.example.christmaspresents.dto.Request;
import com.example.christmaspresents.dto.Producer;
import com.example.christmaspresents.model.Model;
import com.example.christmaspresents.database.DataBaseService;
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
        double coef = checkBox.isSelected() ? 0.95 : 1;
        priceLabel.setText((product.getPrice() * coef) + "");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            reader = new TextFileReader();
            Request request = reader.read("input.txt");
            ObservableList<Producer> optionsProducer = FXCollections.observableArrayList(
                    request.getProducers()
            );
            producerComboBox.setItems(optionsProducer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void onProducerComboBoxClicked(ActionEvent actionEvent){
        DataBaseService dataBaseService = new DataBaseService();
        dataBaseService.createRequest();
        Producer producer = (Producer)producerComboBox.getValue();
        ObservableList<Present> optionsProducer = FXCollections.observableArrayList(
                producer.getPresents()
        );
        productComboBox.setItems(optionsProducer);
    }
}