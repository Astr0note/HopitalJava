package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    //Déclaration liste
    public static List<String> maPlaylist = new ArrayList<>();

    public static Scanner scanMusique = new Scanner(System.in);

    public static void ajoutMusique(){



    //ajouter un élément dans la collection
    System.out.println("Veuillez entrer la musique à ajouter");

    String entreeUtilisateur = scanMusique.nextLine();
    maPlaylist.add(entreeUtilisateur);

    System.out.println("le son '" +entreeUtilisateur +"' a bien été ajouté");

    imprimerPlaylist(maPlaylist);

    }

    public static void supprimerMusique(){

        System.out.println("Veuillez entrer une musique à supprimer");
        String entreeUtilisateur = scanMusique.nextLine();
        maPlaylist.remove(entreeUtilisateur);

        System.out.println("le son '" +entreeUtilisateur +"' a bien été supprimé");
        imprimerPlaylist(maPlaylist);
    }

    public static void viderPlaylist(){

        maPlaylist.clear();

        System.out.println("la playlist est maintenant vide");

        imprimerPlaylist(maPlaylist);

    }

    public static void imprimerPlaylist(List<String> liste) {

        System.out.println("|____Votre playlist____|");
        //parcourir collection
        for (String musique : liste) {
            System.out.println("musique : " + musique);
        }
    }
}
