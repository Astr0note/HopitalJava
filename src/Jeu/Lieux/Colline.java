package Jeu.Lieux;

import Jeu.Lieux.Foret;
import Jeu.Lieux.Jeu;
import Jeu.Lieux.Salle;

import java.util.Scanner;

public class Colline extends Jeu implements Salle {
    @Override
    public void lieux() {
        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();
        switch (entreeUtilisateur){
            case "nord":
                System.out.println("Vous aller au nord");
                Foret foret = new Foret();
                foret.lieux();
                foret.description();
            case "sud":
                System.out.println("Vous ne pouvez pas aller par là");
            case "ouest":
                System.out.println("Vous ne pouvez pas aller par là");

            case "est":
                System.out.println("Vous ne pouvez pas aller par là");
        }
    }

    @Override
    public void description() {
        System.out.println("Vous êtes tout en haut d’une colline qui surplombe la ville, au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau." );
    }
}
