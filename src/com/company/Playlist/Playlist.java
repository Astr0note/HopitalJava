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

    public void ajoutMusique() {
        //ajouter un élément dans la collection
        System.out.println("Entrer le titre de la musique"+entreeNom);
        entreeNom = scanMusique.nextLine();

        System.out.println("Entrer le titre de la musique"+entreeAuteur);
        entreeAuteur = scanMusique.nextLine();

        Musique musique = new Musique(entreeNom, entreeAuteur);
        maPlaylist.add(musique);
    }


    public void supprimerMusique() {

        System.out.println("Veuillez entrer une musique à supprimer");
        String entreeNom = scanMusique.nextLine();
        maPlaylist.remove(entreeNom);

        System.out.println("le son '" + entreeNom + "' a bien été supprimé");
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
        for (Musique musique:liste) {
            System.out.println("titre: " + musique.getNom(entreeNom) +" auteur: "+ musique.getAuteur(entreeAuteur));
        }
        System.out.println("|______________________________________________|");
    }

    public void modifierTitrePlaylist() {
        System.out.println("Veuillez entrer la position de la musique à écraser (attention la playlist commence par 0 et commence par le haut)");
        String entreeUtilisateur = scanMusique.nextLine();

        System.out.println("Veuillez entrer le nomde la musique à écraser");

        Scanner scannerSuppression = new Scanner(System.in);
        String suppression = scannerSuppression.nextLine();

        maPlaylist.remove(suppression);

        System.out.println("entrer la musique de remplacement");
        Scanner scannerRemplacement = new Scanner(System.in);
        String Musique = scannerRemplacement.nextLine();

      //  maPlaylist.add(Integer.parseInt(entreeUtilisateur), Musique);

        System.out.println("la musique en position " + entreeUtilisateur + " a été remplacée par '" +  scannerRemplacement.nextLine() + "'");

        imprimerPlaylist(maPlaylist);
    }

}
