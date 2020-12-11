package com.company.ColossalCave.Lieux;

import com.company.MenuPrincipal;

import java.util.Scanner;

public class Brique extends Jeu implements Salle {
    @Override
    public void lieux() {
        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();
        switch (entreeUtilisateur){
            case "ouest":

                System.out.println("Vous allez à l'ouest");
                Route route = new Route();
                route.description();
                route.lieux();
                break;
            //On ne peut que se diriger que a l'ouest, on a donc un seul case
            case"quit":
                MenuPrincipal.Menu();
                break;

            default:
                System.out.println("erreur commande");
                lieux();
                break;
            //On va mettre ses deux case dans tout les cas pour laisser le joueur quitter et laisser le jeu afficher une erreur si ou autre chose que les case sont taper
        }
    }

    @Override
    public void description() {
        System.out.println("Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes. Un homme git là au milieu d’une marre de sang.");
        System.out.println("vous pouvez allez vers la route a l'ouest");
        System.out.println("tapez -ouest-");
    }
}
