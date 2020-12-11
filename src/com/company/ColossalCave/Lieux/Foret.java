package com.company.ColossalCave.Lieux;

import com.company.MenuPrincipal;

import java.util.Scanner;

public class Foret extends Jeu implements Salle {
    @Override
    public void lieux() {
        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();
        switch (entreeUtilisateur){
            case "sud":

                System.out.println("Vous allez au sud");
                Route route = new Route();
                route.description();
                route.lieux();
                break;
            //On ne peut que se diriger que au sud, on a donc un seul case
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
        System.out.println(" Vous êtes dans la foret noire. Vous entendez des hurlements stridents.");
        System.out.println("vous pouvez allez vers la route au sud");
        System.out.println("tapez -sud-");
    }
}
