package com.example.javafxlms.controller.admin;

import com.example.javafxlms.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;

public class AdminController {

    @FXML
    private Tab orderManagementTab;

    @FXML
    private Tab productManagementTab;

    @FXML
    private Tab reportsTab;

    @FXML
    private Tab roleManagementTab;

    @FXML
    private Tab supplierManagementTab;

    @FXML
    private Tab userManagementTab;

    public void secretaire(ActionEvent event) {
        HelloApplication.changeScene("pageAdmin/pageSecretaire/principal","Secretaire_pagePrincipal_pourAdmin");
    }

    public void medecin(ActionEvent event) {
        HelloApplication.changeScene("pageAdmin/pageMedecin/principale","Medecin_pagePrincipal_pourAdmin");
    }

    public void gestionnaire(ActionEvent event) {
        HelloApplication.changeScene("pageAdmin/pageGestionnaire/pagePrincipale","gestionnaire_pagePrincipal_pourAdmin");
    }

    public void gestionUtilisateur(ActionEvent event) {
    }

    public void monProfil(ActionEvent event) {
    }

    public void deconnexion(ActionEvent event) {
    }
}
