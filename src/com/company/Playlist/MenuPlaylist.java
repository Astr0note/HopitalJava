package com.company.Playlist;

import java.util.Scanner;

public class MenuPlaylist {
    public static void menuPlaylist(){

        boolean menu = false;
        while (menu ==false) {

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

            switch (entreeUtilisateur) {
                case "suivant":
                    System.out.println("passer musique suiv");
                    break;

                case "précedent":
                    System.out.println("musique préc");
                    break;

                case "ajouter":
                    Playlist.ajoutMusique();
                    break;

                case "supprimer":
                    Playlist.supprimerMusique();
                    break;

                case "modifier":
                    System.out.println("musique modifier");
                    break;

                case "vider":
                    Playlist.viderPlaylist();
                    break;

                case "menu":
                    MenuPrincipal.Menu();
                    break;

                case "quitter":
                    System.exit(666);

                default:
                    System.out.println("Choisissez une bonne entrée");
                    System.out.println(" ");
                    break;

            }
        }
    }
}
