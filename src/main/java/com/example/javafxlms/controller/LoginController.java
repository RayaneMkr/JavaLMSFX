package com.example.javafxlms.controller;

import com.example.javafxlms.HelloApplication;
import com.example.javafxlms.entity.Role;
import com.example.javafxlms.entity.Roles;
import com.example.javafxlms.entity.UserConnecte;
import com.example.javafxlms.entity.Utilisateur;
import com.example.javafxlms.repository.UtilisateurRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private Button inscription;

    @FXML
    private Button login;

    @FXML
    private Button oublieMdp;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField userTextField;

    @FXML
    void OnClickInscription(ActionEvent event) {
       if (UserConnecte.getINSTANCE()!=null && UserConnecte.getINSTANCE().getRole()==Roles.getIdRole(Roles.ADMIN)) {
          HelloApplication.changeScene("pageAdmin/register", "inscription");
        }
    }

    @FXML
    void OnClickLogin(ActionEvent event) {
        UtilisateurRepository.connexion(userTextField.getText(),passwordField.getText(),new Label());
        if(UserConnecte.getINSTANCE()!=null && UserConnecte.getINSTANCE().getRole()== Roles.getIdRole(Roles.ADMIN)){
            HelloApplication.changeScene("pageAdmin/pagePrincipale","Principale");
        } else if(UserConnecte.getINSTANCE()!=null && UserConnecte.getINSTANCE().getRole()== Roles.getIdRole(Roles.SECRETAIRE)){
            HelloApplication.changeScene("pageSecretaire/principal","Principale");
        }else if(UserConnecte.getINSTANCE()!=null && UserConnecte.getINSTANCE().getRole()== Roles.getIdRole(Roles.MEDECIN)){
            HelloApplication.changeScene("pageMedecin/principale","Principale");
        }
    }

    @FXML
    void OnClickOublieMdp(ActionEvent event) {

    }


}
