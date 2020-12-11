package com.company.Playlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playlist {

    //Déclaration liste
    public List<Musique> maPlaylist= new ArrayList<>();
    public Scanner scanMusique = new Scanner(System.in);
    public String entreeNom;
    public String entreeAuteur;
    public String entreeDuree;

    //fonction permettant l'ajout de musique à la playlist
    public void ajoutMusique() {
        //ajouter des éléments dans la collection
        System.out.println("Entrer le titre de la musique");
        entreeNom = scanMusique.nextLine();

        System.out.println("Entrer l'auteur de la musique");
        entreeAuteur = scanMusique.nextLine();

        /*System.out.println("Entrer la duree de la musique"+entreeDuree);
        entreeDuree = scanMusique.nextLine();*/

        //création de l'objet musique
        Musique musique = new Musique(entreeNom, entreeAuteur);
        maPlaylist.add(musique);
        System.out.println(maPlaylist);
    }


    //fonction permettant de supprimer une musique de la playlist
    public void supprimerMusique() {

        System.out.println("Entrer le titre de la musique");
        entreeNom = scanMusique.nextLine();

        Musique musique = rechecherMusique(maPlaylist, entreeNom);

        if (musique != null){
            maPlaylist.remove(musique);
        }
        imprimerPlaylist(maPlaylist);
    }

    //fonction permettant de vider la playlist
    public void viderPlaylist() {

        maPlaylist.clear();

        System.out.println("la playlist est maintenant vide");

        imprimerPlaylist(maPlaylist);
    }

    //foncton permettant d'afficher la playlist
    public void imprimerPlaylist(List<Musique> liste) {

        System.out.println("|________________Votre playlist________________|");
        //parcourir collection
        int i = 0;
        for (Musique musique:liste) {
          //  System.out.println("Titre: " + maPlaylist.get(i).getNom() +"| Auteur: "+ maPlaylist.get(i).getAuteur()/*" durée: " + maPlaylist.get(i).getDuree()*/);
            System.out.println("Titre: " + musique.getNom() +"| Auteur: "+ musique.getAuteur());
            i++;
        }
        System.out.println("|______________________________________________|");
    }

    //fonction permettant de modifier un titre de la playlist
    public void modifierTitrePlaylist() {

        supprimerMusique();

        ajoutMusique();

        System.out.println("la musique "+entreeNom + entreeAuteur +" a bien été changer par "+ entreeNom + entreeAuteur);

        imprimerPlaylist(maPlaylist);
    }

    //fonction permettant de rechercher une musique
    public Musique rechecherMusique(List<Musique> liste, String nom){
        for (Musique musique:liste) {
            if (musique.getNom().equals(nom)){
                return musique;
            }
        }
        return null;
    }
}
