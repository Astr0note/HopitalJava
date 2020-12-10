package com.company.Playlist;

public class Musique {
    private String nom;
    private String auteur;
    private float durée;

    public Musique(String nom, String auteur, float durée){
        this.nom = nom;
        this.auteur = auteur;
        this.durée = durée;
    }

    public String getNom() {
        return nom;
    }

    public String getAuteur() {
        return auteur;
    }

    public float getDurée() {
        return durée;
    }
}
