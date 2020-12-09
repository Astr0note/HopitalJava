package com.company.Playlist;

import java.util.Scanner;

public class MenuPrincipal {
    public static void Menu() {

        while (true) {

            System.out.println("H-----------------------H------------------------H");
            System.out.println("Bienvenue dans le SEUL divertissement de l'hopital");
            System.out.println("H------------------Menu du jeu-------------------H");
            System.out.println("Veuillez entrer :");
            System.out.println("-'jeu' pour accéder au jeu");
            System.out.println("-'playlist' pour accéder à la playlist");
            System.out.println("-'menu' pour revenir au menu principal");
            System.out.println("-'quitter' pour quitter");

            Scanner scanChoix = new Scanner(System.in);
            String entreeUtilisateur = scanChoix.nextLine();

            switch (entreeUtilisateur) {

                case "jeu":
                    //Jeu();
                    System.out.println("Entree du jeu");
                    entreeUtilisateur = scanChoix.nextLine();
                    break;

                case "playlist":
                    MenuPlaylist.menuPlaylist();
                    //Playlist();
                    System.out.println("Entree playlist");
                    entreeUtilisateur = scanChoix.nextLine();
                    break;

                case "menu":
                    Menu();
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
