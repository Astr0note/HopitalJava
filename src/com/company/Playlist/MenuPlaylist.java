package com.company.Playlist;

import com.company.MenuPrincipal;
import com.company.Playlist.Playlist;

import java.util.List;
import java.util.Scanner;

public class MenuPlaylist {

    public static void menuPlaylist(){

        boolean menu = false;
        while (menu ==false) {

            System.out.println();
            System.out.println("-------------------Playlist--------------------");

            Playlist.imprimerPlaylist(Playlist.maPlaylist);

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
                    Playlist.ajoutMusique();
                    break;

                case "supprimer":
                    Playlist.supprimerMusique();
                    break;

                case "modifier":
                    Playlist.modifierTitrePlaylist();
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
