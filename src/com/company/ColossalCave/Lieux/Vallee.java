package com.company.ColossalCave.Lieux;

import com.company.MenuPrincipal;

import java.util.Scanner;

public class Vallee extends Jeu implements Salle {
    @Override
    public void lieux() {
        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();
        switch (entreeUtilisateur){
            case "nord":
                Route route = new Route();
                route.description();
                route.lieux();
                break;

            case "ouest":
                Colline colline = new Colline();
                colline.description();
                colline.lieux();
                break;

            case"quit":
                MenuPrincipal.Menu();
                break;

            default:
                System.out.println("erreur commande");
                lieux();
                break;
        }
    }

    @Override
    public void description() {
        System.out.println("Vous êtes dans une vallée a coté d’un ruisseau. Un corps flotte là dans l’eau.");
        System.out.println("vous pouvez allez vers la route au nord ou vers la colline à l'ouest");
        System.out.println("tapez -nord- ou -ouest-");
    }
}
