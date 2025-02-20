package com.example.javafxlms.controller.secretaire;

import com.example.javafxlms.HelloApplication;
import javafx.event.ActionEvent;

public class MainController {
    public void priseEnChargePatient(ActionEvent event) {
        HelloApplication.changeScene("pageSecretaire/priseEncharge","priseEnCharge");
    }

    public void gestionPatient(ActionEvent event) {
        HelloApplication.changeScene("pageSecretaire/gestionPatient","gestionPatient");
    }

    public void monProfil(ActionEvent event) {

    }

    public void deconnexion(ActionEvent event) {
    }
}
