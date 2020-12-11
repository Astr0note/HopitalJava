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

    public void ajoutMusique() {
        //ajouter un élément dans la collection
        System.out.println("Entrer le titre de la musique");
        entreeNom = scanMusique.nextLine();

        System.out.println("Entrer l'auteur de la musique");
        entreeAuteur = scanMusique.nextLine();

        /*System.out.println("Entrer la duree de la musique"+entreeDuree);
        entreeDuree = scanMusique.nextLine();*/

        Musique musique = new Musique(entreeNom, entreeAuteur);
        maPlaylist.add(musique);
        System.out.println(maPlaylist);
    }


    public void supprimerMusique() {

        System.out.println("Entrer le titre de la musique");
        entreeNom = scanMusique.nextLine();

        Musique musique = rechecherMusique(maPlaylist, entreeNom);

        if (musique != null){
            maPlaylist.remove(musique);
        }
        imprimerPlaylist(maPlaylist);
    }

    public void viderPlaylist() {

        maPlaylist.clear();

        System.out.println("la playlist est maintenant vide");

        imprimerPlaylist(maPlaylist);
    }

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

    public void modifierTitrePlaylist() {

        supprimerMusique();

        ajoutMusique();

        System.out.println("la musique "+entreeNom + entreeAuteur +" a bien été changer par "+ entreeNom + entreeAuteur);

        imprimerPlaylist(maPlaylist);
    }


    public String getArtiste(int index)
    {
        return maPlaylist.get(index).getAuteur();
    }

    public String getTitre(int index)
    {
        return maPlaylist.get(index).getNom();
    }

    public Musique rechecherMusique(List<Musique> liste, String nom){
        for (Musique musique:liste) {
            if (musique.getNom().equals(nom)){
                return musique;
            }
        }
        return null;
    }
}
