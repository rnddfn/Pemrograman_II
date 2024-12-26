package com.example.soal1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML
    private TableColumn<Mahasiswa, String> id;

    @FXML
    private TableColumn<Mahasiswa, String> nama;

    @FXML
    private TableColumn<Mahasiswa, String> nim;

    @FXML
    private TableView<Mahasiswa> table;

    private ObservableList<Mahasiswa> initialData() {
        Mahasiswa mhs1 = new Mahasiswa(1, "Randy", "2310817110013");
        Mahasiswa mhs2 = new Mahasiswa(2, "Raka", "2310817110014");
        Mahasiswa mhs3 = new Mahasiswa(3, "Aldi", "2310817110015");
        Mahasiswa mhs4 = new Mahasiswa(4, "Fikri", "2310817110016");
        Mahasiswa mhs5 = new Mahasiswa(5, "Dina", "2310817110017");
        Mahasiswa mhs6 = new Mahasiswa(6 ,"Lisa", "2310817110018");
        Mahasiswa mhs7 = new Mahasiswa(7, "Rini", "2310817110019");
        Mahasiswa mhs8 = new Mahasiswa(8, "Sinta", "2310817110020");
        Mahasiswa mhs9 = new Mahasiswa(9, "Dapa", "231081711007");
        Mahasiswa mhs10 = new Mahasiswa(10, "Hasbi", "2310817210069");

        return FXCollections.observableArrayList(mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, mhs8);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        nama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        nim.setCellValueFactory(new PropertyValueFactory<>("nim"));

        table.setItems(initialData());
    }
}
