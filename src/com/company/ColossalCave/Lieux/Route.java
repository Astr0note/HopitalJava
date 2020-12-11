package com.company.ColossalCave.Lieux;

import com.company.MenuPrincipal;

import java.util.Scanner;

public class Route extends Jeu implements Salle {

    @Override
    public void lieux() {

        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();
        switch (entreeUtilisateur) {
            case "nord":
                Foret foret = new Foret();
                foret.description();
                foret.lieux();
                break;

            case "sud":

                Vallee vallee = new Vallee();
                vallee.description();
                vallee.lieux();
                break;

            case "ouest":

                Colline colline = new Colline();
                colline.description();
                colline.lieux();
                break;

            case "est":

                Brique brique = new Brique();
                brique.description();
                brique.lieux();
                break;
            case "quit":
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
        System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique. Un petit ruisseau coule a côté du building en bas d’une rigole.");
        System.out.println("vous pouvez allez vers la vallée au sud , la colline à l'ouest , la foret au nord , building en brique à l'est");
        System.out.println("tapez -sud- , -ouest- , -nord- , ou -est-");
        ;
    }
}
