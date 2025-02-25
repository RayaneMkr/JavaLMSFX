package com.example.javafxlms.entity;

public class DemandeProduit {
    private int id_demande_produit;
    private int quantite;
    private int date_demande;
    private int statut;
    private int ref_utilisateur;
    private int ref_produit;
    private int ref_validateur;


    public int getId_demande_produit() {
        return id_demande_produit;
    }

    public void setId_demande_produit(int id_demande_produit) {
        this.id_demande_produit = id_demande_produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getDate_demande() {
        return date_demande;
    }

    public void setDate_demande(int date_demande) {
        this.date_demande = date_demande;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public int getRef_utilisateur() {
        return ref_utilisateur;
    }

    public void setRef_utilisateur(int ref_utilisateur) {
        this.ref_utilisateur = ref_utilisateur;
    }

    public int getRef_produit() {
        return ref_produit;
    }

    public void setRef_produit(int ref_produit) {
        this.ref_produit = ref_produit;
    }

    public int getRef_validateur() {
        return ref_validateur;
    }

    public void setRef_validateur(int ref_validateur) {
        this.ref_validateur = ref_validateur;
    }

    public DemandeProduit(int id_demande_produit, int quantite, int date_demande, int statut, int ref_utilisateur, int ref_produit, int ref_validateur) {
        this.id_demande_produit = id_demande_produit;
        this.quantite = quantite;
        this.date_demande = date_demande;
        this.statut = statut;
        this.ref_utilisateur = ref_utilisateur;
        this.ref_produit = ref_produit;
        this.ref_validateur = ref_validateur;

    }
}
