package com.example.javafxlms.repository;

import com.example.javafxlms.bdd.Bdd;
import com.example.javafxlms.entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CommandeRepository {

    static Bdd connexionBdd = new Bdd();
    static Connection connection = connexionBdd.getConnection();

    public static ArrayList<Commande> recupererCommandes() {
        ArrayList<Commande> liste = new ArrayList<>();
        String sql = "SELECT * FROM commande";
        try {
            PreparedStatement requetePrepare = connection.prepareStatement(sql);
            ResultSet resultatRequete = requetePrepare.executeQuery();
            while (resultatRequete.next()) {
                liste.add(new Commande(
                        resultatRequete.getInt("id_comande"),
                        resultatRequete.getInt("prix"),
                        resultatRequete.getInt("quantite"),
                        resultatRequete.getString("etat"),
                        resultatRequete.getInt("date_commande"),
                        resultatRequete.getInt("ref_fournisseur"),
                        resultatRequete.getInt("ref_produit")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return liste;
    }
}
