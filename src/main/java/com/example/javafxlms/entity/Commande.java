package com.example.javafxlms.entity;

public class Commande {
    private int id_commande;
    private int prix;
    private int quantite;
    private String etat;
    private int date_commande;
    private int ref_fournisseur;
    private int ref_produit;

    public Commande(int id_commande, int prix, int quantite, String etat, int date_commande, int ref_fournisseur, int ref_produit) {
        this.id_commande = id_commande;
        this.prix = prix;
        this.quantite = quantite;
        this.etat = etat;
        this.date_commande = date_commande;
        this.ref_fournisseur = ref_fournisseur;
        this.ref_produit = ref_produit;
    }

    public int getId_commande() {

        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(int date_commande) {
        this.date_commande = date_commande;
    }

    public int getRef_fournisseur() {
        return ref_fournisseur;
    }

    public void setRef_fournisseur(int ref_fournisseur) {
        this.ref_fournisseur = ref_fournisseur;
    }

    public int getRef_produit() {
        return ref_produit;
    }

    public void setRef_produit(int ref_produit) {
        this.ref_produit = ref_produit;
    }
}
