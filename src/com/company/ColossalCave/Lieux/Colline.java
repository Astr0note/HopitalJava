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
                System.out.println("Vous allez au nord");
                Foret foret = new Foret();
                foret.description();
                foret.lieux();
                break;
            //On ne peut que se diriger que au nord, on a donc un seul case
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
        System.out.println("Vous êtes tout en haut d’une colline qui surplombe la ville, au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau." );
        System.out.println("vous pouvez allez vers la foret au nord");
        System.out.println("tapez -nord-");
    }
}
