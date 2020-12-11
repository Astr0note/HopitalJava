package com.company.Playlist;

import com.company.MenuPrincipal;

import java.util.Scanner;

public class MenuPlaylist {

    public static void menuPlaylist(){
        Playlist playlist = new Playlist();

            //affichage des indications de la playlist
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

                //si le patient tape "ajouter" il pourra ajouter la musique
                case "ajouter":
                    playlist.ajoutMusique();
                    break;

                //si le patient tape "supprimer" il pourra supprimer la musique
                case "supprimer":
                    playlist.supprimerMusique();
                    break;

                //si le patient tape "modifier" il pourra modifier une musique
                case "modifier":
                    playlist.modifierTitrePlaylist();
                    break;

                //si le patient tape "vider" il pourra vider la playlist
                case "vider":
                    playlist.viderPlaylist();
                    break;

                //si le patient tape "menu" il accède au menu principal
                case "menu":
                    MenuPrincipal.Menu();
                    break;

                //si le patient tape "quitter" il ferme l'application
                case "quitter":
                    System.exit(666);

                //si le patient tape autre chose message d'erreur
                default:
                    System.out.println("Choisissez une bonne entrée");
                    System.out.println(" ");
                    MenuPrincipal.Menu();
                    break;

            }
    }
}
