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

                System.out.println("Vous aller au sud");
                Route route = new Route();
                route.description();
                route.lieux();
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
        System.out.println(" Vous êtes dans la foret noire. Vous entendez des hurlements stridents.");
        System.out.println("vous pouvez allez vers la route au sud");
        System.out.println("tapez -sud-");
    }
}
