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


    public Musique(String nom, String auteur){
        this.nom = nom;
        this.auteur = auteur;
    }


}