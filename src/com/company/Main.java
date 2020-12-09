package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Menu();

    }

    public static void Menu() {

        boolean menu = false;
        while (menu ==false){

        System.out.println();
        System.out.println("Bienvenue dans le SEUL divertissement de l'hopital");
        System.out.println("-------------------Menu du jeu--------------------");
        System.out.println("Veuillez entrer :");
        System.out.println("-'jeu' pour accéder au jeu");
        System.out.println("-'playlist' pour accéder à la playlist");
        System.out.println("-'menu' pour revenir au menu principal");
        System.out.println("-'quitter' pour quitter");

        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();

            switch (entreeUtilisateur) {

                case "jeu" :
                    //Jeu();
                    System.out.println("Entree du jeu");
                    entreeUtilisateur = scanChoix.nextLine();
                    break;

                case "playlist" :
                    Playlist.playlist();
                    //Playlist();
                    System.out.println("Entree playlist");
                    entreeUtilisateur = scanChoix.nextLine();
                    break;

                case "menu":
                    menu = false;
                    break;

                case "quitter" :
                    System.exit(666);

                default :
                    System.out.println("Choisissez une bonne entrée");
                    System.out.println(" ");
                    break;
            }

        }

    }
}

