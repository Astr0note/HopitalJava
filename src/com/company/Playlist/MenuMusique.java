package com.company.Playlist;

import com.company.MenuPrincipal;

import java.util.Scanner;

public class MenuMusique {
    public static void menuMusique() {

        System.out.println();
        System.out.println("-------------------Musique--------------------");
        System.out.println("Veuillez entrer :");
        System.out.println("-'suivant' pour passer à la musique suivante");
        System.out.println("-'précédent' pour passer à la musique précendente");
        System.out.println("-'ajouter' pour ajouter une musique");
        System.out.println("-'menu' pour revenir au menu principal");
        System.out.println("-'quitter' pour quitter");

        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();

        switch (entreeUtilisateur) {
            case "suivant":
                System.out.println("passer musique suiv");
                break;

            case "précedent":
                System.out.println("musique préc");
                break;

            case"menu":
                MenuPrincipal.Menu();
                break;

            case "quitter":
                System.exit(666);
        }

    }

}
