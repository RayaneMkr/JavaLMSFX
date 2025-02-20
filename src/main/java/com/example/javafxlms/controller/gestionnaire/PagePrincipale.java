package com.example.javafxlms.controller.gestionnaire;

import com.example.javafxlms.HelloApplication;
import javafx.event.ActionEvent;

public class PagePrincipale {

    public void GestionStock(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/gestionStock","gestion de stock");
    }

    public void DemandeProduit(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/demandeProduit","demande de produit");
    }

    public void Fournisseur(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/gestionFournisseur","Fournisseur");
    }

    public void Commande(ActionEvent event) {
        HelloApplication.changeScene("pageGestionnaire/gestionCommande","gestion de commande");
    }

    public void MonProfil(ActionEvent event) {

    }

    public void Deconnexion(ActionEvent event) {
    }
}
