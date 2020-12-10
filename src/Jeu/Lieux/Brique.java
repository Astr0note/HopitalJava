package Jeu.Lieux;

import Jeu.Lieux.Jeu;
import Jeu.Lieux.Route;
import Jeu.Lieux.Salle;

import java.util.Scanner;

public class Brique extends Jeu implements Salle {
    @Override
    public void lieux() {
        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();
        switch (entreeUtilisateur){
            case "nord":
                System.out.println("Vous ne pouvez pas aller par là");

            case "sud":
                System.out.println("Vous ne pouvez pas aller par là");
            case "ouest":

                System.out.println("Vous aller à l'ouest");
                Route route = new Route();
                route.lieux();
                route.description();
            case "est":
                System.out.println("Vous ne pouvez pas aller par là");
        }
    }

    @Override
    public void description() {
        System.out.println("Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes. Un homme git là au milieu d’une marre de sang.");
    }
}
