package com.example.p03_2072051.controller;

import com.example.p03_2072051.ManagementApp;
import com.example.p03_2072051.model.Barang;
import com.example.p03_2072051.model.Supplier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    public TextField txtID;
    public TextField txtNama;
    public ComboBox cmbSupplier;
    public Button btnSave;
    public Button btnReset;
    public TableView table1;
    public TableColumn kolom1;
    public TableColumn kolom2;
    public TableColumn kolom3;
    public Button btnUpdate;
    public MenuItem klikShow;
    public MenuItem tutup;
    private ObservableList<Barang> oList;

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stage = new Stage();
        oList = FXCollections.observableArrayList();
        table1.setItems(oList);
        kolom1.setCellValueFactory(new PropertyValueFactory<>("ID"));
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nama"));
        kolom3.setCellValueFactory(new PropertyValueFactory<>("supplier"));
    }

    public void onShow(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader;
        loader = new FXMLLoader(ManagementApp.class.getResource("Supplier-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Supplier Management");
        stage.setScene(scene);
        stage.show();
    }
    public void onTambah(ActionEvent actionEvent) {
        int ID = Integer.parseInt(txtID.getText());
        String nama = txtNama.getText();
        String supplier = cmbSupplier.getId();

        oList.add(new Barang(ID,nama,supplier));
        txtID.setText("");
        txtNama.setText("");
        cmbSupplier.setItems(oList);
    }
    public void onHapus(ActionEvent actionEvent) {
        table1.getItems().removeAll(table1.getSelectionModel().getSelectedItem());
    }

    public void up(ActionEvent actionEvent) {
        btnUpdate.setVisible(false);
    }
}
