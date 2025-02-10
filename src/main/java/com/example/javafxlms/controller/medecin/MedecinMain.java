package com.example.javafxlms.controller.medecin;

import com.example.javafxlms.HelloApplication;
import com.example.javafxlms.entity.UserConnecte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MedecinMain {

    @FXML
    private Button deconnexion;

    @FXML
    private Button demandeProduit;

    @FXML
    private Button dossierPatient;

    @FXML
    private Button hospitalisation;

    @FXML
    private Button monProfil;

    @FXML
    private Button rdv;

    @FXML
    private Label statusLabel;

    @FXML
    void deconnexion(ActionEvent event) {
        if (UserConnecte.clearInstance()){
            HelloApplication.changeScene("accueil/login","login");
        }
    }

    @FXML
    void demandeProduit(ActionEvent event) {
        HelloApplication.changeScene("pageMedecin/demandeProduit","Demande de produit");
    }

    @FXML
    void dossierPatient(ActionEvent event) {
        HelloApplication.changeScene("pageMedecin/dossierPatient","Dossier Patient");
    }

    @FXML
    void hospitalisation(ActionEvent event) {
        HelloApplication.changeScene("pageMedecin/hospitalisation", "Hospitalisation");
    }

    @FXML
    void monProfil(ActionEvent event) {

    }

    @FXML
    void rdv(ActionEvent event) {

    }

}
