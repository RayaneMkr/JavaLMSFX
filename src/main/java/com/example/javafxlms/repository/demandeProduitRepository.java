package com.example.javafxlms.repository;

import com.example.javafxlms.bdd.Bdd;
import java.sql.Connection;
import com.example.javafxlms.entity.DemandeProduit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class demandeProduitRepository {
    static Bdd connexionBdd = new Bdd();
    static Connection connection = connexionBdd.getConnection();

    public static void AjouterUneDemande(int quantite,int date_demande,int statut,int ref_utilisateur,int ref_produit,int ref_validateur) {
        String sql= "INSERT INTO demande_produit(quantite,date_demande,statut,ref_utilisateur,ref_produit,ref_validateur ) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, quantite);
            requete.setInt(2,date_demande);
            requete.setInt(3,statut);
            requete.setInt(4,ref_utilisateur);
            requete.setInt(5,ref_produit);
            requete.setInt(6,ref_validateur);
            requete.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void modifierDemande(int id_demande_produit,int quantite,int date_demande,int statut,int ref_utilisateur,int ref_produit,int ref_validateur){
        String sql = "Update demande_produit SET quantite = ? , date_demande = ? , statut = ? , ref_utilisateur = ? , ref_produit = ? , ref_validateur = ? WHERE id_demande_produit = ?";
        try{
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1,quantite);
            requete.setInt(2,date_demande);
            requete.setInt(3,statut);
            requete.setInt(4,ref_utilisateur);
            requete.setInt(5,ref_produit);
            requete.setInt(6,ref_validateur);
            requete.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void supprimerDemande(int id_demande_produit) {
        String sql = "DELETE FROM demande_produit WHERE id_demande_produit = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1,id_demande_produit);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<DemandeProduit> recupererLesDemandes(){
        ArrayList<DemandeProduit> liste = new ArrayList<>();
        String sql = "SELECT * FROM demande_produit";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            ResultSet resultatRequete = requete.executeQuery();
            while (resultatRequete.next()){

                liste.add(new DemandeProduit(
                        resultatRequete.getInt("id_demande_produit"),
                        resultatRequete.getInt("quantite"),
                        resultatRequete.getInt("date_demande"),
                        resultatRequete.getInt("statut"),
                        resultatRequete.getInt("ref_utilisateur"),
                        resultatRequete.getInt("ref_produit"),
                        resultatRequete.getInt("ref_validateur")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return liste;
    }
}
