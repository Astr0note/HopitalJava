package com.company.Playlist;

public class Musique {
    private String nom;
    private String auteur;


    public String getNom(String nom) {
        return nom;
    }

    public String getAuteur(String auteur) {
        return auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getNom() {
        return nom;
    }

    public Musique(String nom, String auteur){
        this.nom = nom;
        this.auteur = auteur;
    }


}
