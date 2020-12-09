package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    public static void menuPlaylist(){
        System.out.println();
        System.out.println("-------------------Playlist--------------------");
        System.out.println("Veuillez entrer :");
        System.out.println("-'suivant' pour passer à la musique suivante");
        System.out.println("-'précédent' pour passer à la musique précendente");
        System.out.println("-'ajouter' pour ajouter une musique");
        System.out.println("-'supprimer' pour supprimer une musique");
        System.out.println("-'modifier' pour modifier");
        System.out.println("-'vider' pour vider la playlist");
        System.out.println("-'menu' pour revenir au menu principal");
        System.out.println("-'quitter' pour quitter");

        Scanner scanChoixPlaylist = new Scanner(System.in);
        String entreeUtilisateur = scanChoixPlaylist.nextLine();

        switch (entreeUtilisateur){
            case "suivant" :
                System.out.println("passer musique suiv");
                break;

            case "précedent" :
                System.out.println("musique préc");
                break;

            case "ajouter" :
                System.out.println("ajout son");
                break;

            case "supprimer" :
                System.out.println("supr son");
                break;

            case "modifier":
                System.out.println("musique modifier");
                break;

            case "vider" :
                System.out.println("playlist vide");
                break;

            case "menu":
                Main.Menu();
                break;

            case "quitter" :
                System.exit(666);

            default :
                System.out.println("Choisissez une bonne entrée");
                System.out.println(" ");
                break;

        }
    }

    public static void playlist() {

    Scanner scanMusique = new Scanner(System.in);

    //Déclaration liste
    List<String> maPlaylist= new ArrayList<>();

    //ajouter un élément dans la collection
    String entreeUtilisateur = scanMusique.nextLine();
    maPlaylist.add(entreeUtilisateur);

    imprimerPlaylist(maPlaylist);

    }

    public static void imprimerPlaylist(List<String> liste){
        //parcourir collection
        for (String musique:liste){
            System.out.println("musique : " + musique);
        }
    }
}
