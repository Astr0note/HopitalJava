package com.company.Playlist;

import com.company.MenuPrincipal;

import java.util.Scanner;

public class MenuPlaylist {

    public static void menuPlaylist(){
        Playlist playlist = new Playlist();

        boolean menu = false;
        while (menu ==false) {

            System.out.println();
            System.out.println("-------------------Playlist--------------------");

            playlist.imprimerPlaylist(playlist.maPlaylist);

            System.out.println("Veuillez entrer :");
            System.out.println("-'ajouter' pour ajouter une musique");
            System.out.println("-'supprimer' pour supprimer une musique");
            System.out.println("-'modifier' pour modifier");
            System.out.println("-'vider' pour vider la playlist");
            System.out.println("-'menu' pour revenir au menu principal");
            System.out.println("-'quitter' pour quitter");

            Scanner scanChoixPlaylist = new Scanner(System.in);
            String entreeUtilisateur = scanChoixPlaylist.nextLine();

            switch (entreeUtilisateur) {

                case "ajouter":
                    playlist.ajoutMusique();
                    break;

                case "supprimer":
                    playlist.supprimerMusique();
                    break;

                case "modifier":
                    playlist.modifierTitrePlaylist();
                    break;

                case "vider":
                    playlist.viderPlaylist();
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
