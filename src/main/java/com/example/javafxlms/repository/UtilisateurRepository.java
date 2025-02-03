package com.example.javafxlms.repository;

import com.example.javafxlms.bdd.Bdd;
import com.example.javafxlms.entity.Utilisateur;
import javafx.scene.control.Label;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UtilisateurRepository {


    static Bdd connexionBdd = new Bdd();
    static Connection connection = connexionBdd.getConnection();

    public static ArrayList<Utilisateur> recupererUtilisateur() {
        ArrayList<Utilisateur> liste = new ArrayList<>();
        String sql = "SELECT * FROM utilisateur ";
        try {
            PreparedStatement requetePrepare = connection.prepareStatement(sql);
            ResultSet resultatRequette = requetePrepare.executeQuery();
            while (resultatRequette.next()) {
                liste.add(new Utilisateur(resultatRequette.getInt("id_utilisateur"),resultatRequette.getString("nom"),resultatRequette.getString("prenom"),resultatRequette.getString("email"),resultatRequette.getString("mdp"),resultatRequette.getInt("ref_role")));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return liste;
    }

    public static Utilisateur getUserByEmail(String email){
        Bdd connexionBdd = new Bdd();
        Connection connection = connexionBdd.getConnection();
        String sql = "SELECT * FROM utilisateur WHERE email = ? ";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setString(1,email);
            ResultSet resultatRequette = requete.executeQuery();
            System.out.println(resultatRequette);
            if(resultatRequette.next()){
                int id = resultatRequette.getInt(1);
                String nom = resultatRequette.getString(2);
                String prenom = resultatRequette.getString(3);
                String email1 = resultatRequette.getString(4);
                String mdP = resultatRequette.getString(5);
                int role = resultatRequette.getInt(7);
                System.out.println(email + " "+ mdP );
                Utilisateur user = new Utilisateur(id,nom, prenom,email1,mdP,role);


                return user;
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Utilisateur connexion(String identifiant, String mdp, Label label){
        //System.out.println("Id : " + identifiant);
        Utilisateur user = getUserByEmail(identifiant);
        System.out.println("Hello : " + user);

        if (user == null){
            label.setText("erreur vous n'avez pas de compte");
        }else {

            System.out.println(mdp);
            System.out.println(user.getMdp());
            if (BCrypt.checkpw(mdp,user.getMdp())){
                return user;
            } else {
                label.setText("Mot de passe incorrect");
            }
        }
        return null;
    }

    public static void inscription(String nom, String prenom, String email, String mdp,int role, Label label){
        if(getUserByEmail(email)!=null){

            label.setText("Erreur vous avez deja un compte");
        }else {
            String sql1 = "INSERT INTO utilisateur (nom,prenom,email,mdp,role) VALUES (?,?,?,?,?) ";

            try {
                PreparedStatement requete = connection.prepareStatement(sql1);
                requete.setString(1,nom);
                requete.setString(2,prenom);
                requete.setString(3,email);
                requete.setString(4,BCrypt.hashpw(mdp, BCrypt.gensalt()));
                requete.setInt(5,role);
                requete.executeUpdate();
                label.setText("Nouvelle utilisateur enregistrer !");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

