package com.example.songsviewer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class HelloController {
    public TableView<music> allSongsView;
    public TableColumn<Object, Object> Artist;
    public TableColumn<Object, Object> Interactions;
    public TableColumn<Object, Object> Released;
    public TableColumn<Object, Object> Name;


    public void initialize() throws Exception {
        song.readAllData();
        ArrayList<music> temporaryList = (ArrayList<music>) song.getAllData();
        ObservableList<music> temporaryObservableList = FXCollections.observableArrayList(temporaryList);
        allSongsView.setItems(temporaryObservableList);

        Name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        Interactions.setCellValueFactory(new PropertyValueFactory<>("Interactions"));
        Released.setCellValueFactory(new PropertyValueFactory<>("Released"));
        Artist.setCellValueFactory(new PropertyValueFactory<>("Artist"));
    }
}
