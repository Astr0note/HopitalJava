package com.company.Playlist;

import com.company.MenuPrincipal;

import java.util.Scanner;

public class MenuMusique {
    public void menuMusique() {

        //créer une nouvelle playlist
        Playlist playlist = new Playlist();

        //affichage des indications de l'écoute en cours
        System.out.println();
        System.out.println("-------------------Musique--------------------");
        System.out.println("Veuillez entrer :");
        System.out.println("-'afficher' pour afficher la premiere musique de la playlist");
        System.out.println("-'suivant' pour passer à la musique suivante");
        System.out.println("-'précédent' pour passer à la musique précendente");
        System.out.println("-'ajouter' pour ajouter une musique");
        System.out.println("-'menu' pour revenir au menu principal");
        System.out.println("-'quitter' pour quitter");

        //scanner permettant de récupérer l'entrée des patients
        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();


        switch (entreeUtilisateur) {
            //si le patient tape "afficher" la playlist sera affichée
            case "afficher":
                playlist.imprimerPlaylist(playlist.maPlaylist);
                break;

            //si le patients tape "suivant" il passe à la musique suivante
            case "suivant":
                System.out.println("passer musique suiv");
                break;

            //si le patient tape "précédent" il passe à la musique précédente
            case "précedent":
                System.out.println("musique préc");
                break;

            //si le patient tape "menu" il accède au menu principal
            case"menu":
                MenuPrincipal.Menu();
                break;

            //si le patient tape "quitter" il ferme l'application
            case "quitter":
                System.exit(666);

                //si le patient tape autre chose message d'erreur
            default:
                System.out.println("Choisissez une bonne entrée");
                System.out.println(" ");
                menuMusique();
                break;
        }

    }

}
