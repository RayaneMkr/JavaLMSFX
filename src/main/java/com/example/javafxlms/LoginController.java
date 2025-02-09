package com.example.javafxlms;

import com.example.javafxlms.entity.Roles;
import com.example.javafxlms.entity.UserConnecte;
import com.example.javafxlms.entity.Utilisateur;
import com.example.javafxlms.repository.UtilisateurRepository;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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

    }

    @FXML
    void OnClickOublieMdp(ActionEvent event) {

    }

}
