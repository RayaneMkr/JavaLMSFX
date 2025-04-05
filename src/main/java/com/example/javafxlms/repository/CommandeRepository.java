package com.example.javafxlms.repository;

import com.example.javafxlms.bdd.Bdd;
import com.example.javafxlms.entity.*;
import javafx.scene.control.Label;

import java.sql.*;
import java.util.ArrayList;

public class CommandeRepository {

    static Bdd connexionBdd = new Bdd();
    static Connection connection = connexionBdd.getConnection();

    public  ArrayList<Commande> recupererCommandes() {
        ArrayList<Commande> liste = new ArrayList<>();
        String sql = "SELECT * FROM commande";
        try {
            PreparedStatement requetePrepare = connection.prepareStatement(sql);
            ResultSet resultatRequete = requetePrepare.executeQuery();
            while (resultatRequete.next()) {
                System.out.println("Hey ! Commande");
                System.out.println("Qte "+resultatRequete.getInt("quantite"));
                liste.add(new Commande(
                        resultatRequete.getInt("id_comande"),
                        resultatRequete.getInt("prix"),
                        resultatRequete.getInt("quantite"),
                        resultatRequete.getString("etat"),
                        resultatRequete.getDate("date_commande"),
                        resultatRequete.getInt("ref_fournisseur"),
                        resultatRequete.getInt("ref_produit")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return liste;
    }
    public static void AjouterUneCommande(int prix, int quantite, int etat, Date date_commande, int ref_fournisseur, int ref_produit) {
        String sql= "INSERT INTO commande(prix,quantite,etat,date_commande,ref_fournisseur,ref_produit ) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, prix);
            requete.setInt(2,quantite);
            requete.setInt(3,etat);
            requete.setDate(4,date_commande);
            requete.setInt(5,ref_fournisseur);
            requete.setInt(6,ref_produit);
            requete.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void modifierCommande(int prix,int quantite,int etat,int date_commande,int ref_fournisseur,int ref_produit){
        String sql = "Update commande SET prix = ? , quantite = ? , etat = ? , date_commande = ? , ref_fournisseur = ? , ref_produit = ? WHERE id_commande = ?";
        try{
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1,prix);
            requete.setInt(2,quantite);
            requete.setInt(3,etat);
            requete.setInt(4,date_commande);
            requete.setInt(5,ref_fournisseur);
            requete.setInt(6,ref_produit);
            requete.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void supprimerCommande(int id_commande, Label erreur) {
        String sql = "DELETE FROM commande WHERE id_commande = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1,id_commande);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
