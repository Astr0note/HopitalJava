package com.company.ColossalCave.Lieux;

import com.company.MenuPrincipal;

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
                foret.description();
                foret.lieux();
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
        System.out.println("Vous êtes tout en haut d’une colline qui surplombe la ville, au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau." );
        System.out.println("vous pouvez allez vers la foret au nord");
        System.out.println("tapez -nord-");
    }
}
