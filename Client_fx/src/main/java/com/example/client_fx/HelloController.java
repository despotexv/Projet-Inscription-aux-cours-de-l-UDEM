package com.example.client_fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static javafx.scene.paint.Color.*;

/**
 * classe qui permet de controler les actions d'un utilisateur sur l'interface graphique
 */
public class HelloController{
    @FXML
    private TableView<Course> ListeDesCours;
    @FXML
    private TableColumn<Course, String> Code;
    @FXML
    private TableColumn<Course, String> NomCours;

    @FXML
    private TextField Prenom;
    @FXML
    private TextField Nom;
    @FXML
    private TextField Email;
    @FXML
    private TextField Matricule;
    @FXML
    private ComboBox<String> Session;
}