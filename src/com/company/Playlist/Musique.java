package com.company.Playlist;

public class Musique {
    private String nom;
    private String auteur;
    private String duree;



    public String getAuteur() {
        return auteur;
    }

    public String getNom() {
        return nom;
    }

    public String getDuree() {
        return duree;
    }

    public Musique(String nom, String auteur){
        this.nom = nom;
        this.auteur = auteur;
    }


}
