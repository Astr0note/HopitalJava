package Jeu.Lieux;

import java.util.Scanner;

public class Vallee extends Jeu implements Salle {
    @Override
    public void lieux() {
        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();
        switch (entreeUtilisateur){
            case "nord":
                Route route = new Route();
                route.lieux();
                route.description();
            case "sud":
                System.out.println("Vous ne pouvez pas aller par là");
            case "ouest":

                Colline colline = new Colline();
                colline.lieux();
                colline.description();
            case "est":
                System.out.println("Vous ne pouvez pas aller par là");
        }
    }

    @Override
    public void description() {
        System.out.println("Vous êtes dans une vallée a coté d’un ruisseau. Un corps flotte là dans l’eau.");
    }
}
