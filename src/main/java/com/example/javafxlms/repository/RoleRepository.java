package com.example.javafxlms.repository;

import com.example.javafxlms.bdd.Bdd;
import com.example.javafxlms.entity.Role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoleRepository {

    static Bdd connexionBdd = new Bdd();
    static Connection connection = connexionBdd.getConnection();


    public static ArrayList<Role> recupererRoles() {
        ArrayList<Role> liste = new ArrayList<>();
        String sql = "SELECT * FROM role";
        try {
            PreparedStatement requetePrepare = connection.prepareStatement(sql);
            ResultSet resultatRequete = requetePrepare.executeQuery();
            while (resultatRequete.next()) {
                liste.add(new Role(
                        resultatRequete.getInt("id_role"),
                        resultatRequete.getString("nom_role")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return liste;
    }


    public static void ajouterRole(String nom_role) {
        String sql = "INSERT INTO role (nom_role) VALUES (?)";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setString(1, nom_role);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static Role getRoleById(int id_role) {
        String sql = "SELECT * FROM role WHERE id_role = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_role);
            ResultSet resultatRequete = requete.executeQuery();
            if (resultatRequete.next()) {
                return new Role(
                        resultatRequete.getInt("id_role"),
                        resultatRequete.getString("nom_role")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    // Supprimer un rôle
    public static void supprimerRole(int id_role) {
        String sql = "DELETE FROM role WHERE id_role = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setInt(1, id_role);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Mettre à jour un rôle
    public static void mettreAJourRole(int id_role, String nom_role) {
        String sql = "UPDATE role SET nom_role = ? WHERE id_role = ?";
        try {
            PreparedStatement requete = connection.prepareStatement(sql);
            requete.setString(1, nom_role);
            requete.setInt(2, id_role);
            requete.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
