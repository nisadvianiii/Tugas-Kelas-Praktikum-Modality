package com.example.p03_2072051.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.example.p03_2072051.model.Supplier;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class SupController implements Initializable {
    public TextField txtID;
    public TextField txtAlamat;
    public TextField txtNama;
    public Button btnSave;
    public Button btnReset;
    public TableView table1;
    public TableColumn kolom1;
    public TableColumn kolom2;
    public TableColumn kolom3;
    public Button btnUpdate;

    private ObservableList<Supplier> oList;


    public void onTambah(ActionEvent actionEvent) {
        int ID = Integer.parseInt(txtID.getText());
        String nama = txtNama.getText();
        String alamat = txtAlamat.getText();

        oList.add(new Supplier(ID,nama,alamat));
        txtID.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        oList = FXCollections.observableArrayList();
        table1.setItems(oList);
        kolom1.setCellValueFactory(new PropertyValueFactory<>("ID"));
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nama"));
        kolom3.setCellValueFactory(new PropertyValueFactory<>("alamat"));
    }

    public void onHapus(ActionEvent actionEvent) {
        table1.getItems().removeAll(table1.getSelectionModel().getSelectedItem());
    }

    public void up(ActionEvent actionEvent) {
        btnUpdate.setVisible(false);
    }
}
