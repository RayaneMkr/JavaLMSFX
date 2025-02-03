package com.example.javafxlms.entity;

public class Fournisseur_produit {
    private int id_fournisseur_produit;
    private int ref_fournisseur;
    private int ref_produit;
    private int prix;

    public int getId_fournisseur_produit() {
        return id_fournisseur_produit;
    }

    public void setId_fournisseur_produit(int id_fournisseur_produit) {
        this.id_fournisseur_produit = id_fournisseur_produit;
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

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
