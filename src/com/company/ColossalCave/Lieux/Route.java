package com.company.ColossalCave.Lieux;

import com.company.MenuPrincipal;

import java.util.Scanner;

public class Route extends Jeu implements Salle {

    @Override
    public void lieux() {
        //on récupère ce que tape l'utilisateur

        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();
        switch (entreeUtilisateur) {
            case "nord":
                Foret foret = new Foret(); //On crée un objet foret pour le connecté à la classe Foret
                foret.description(); //on récupère la description de la classe Foret
                foret.lieux(); //on fait envoi l'utilisateur vers le switch case de la classe Foret
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
                //Dans le cas de la route, on peut aller dans les 4 direction, on a donc 4 case différentes
            case "quit":
                MenuPrincipal.Menu();
                break;

            default:
                System.out.println("erreur commande");
                lieux();
                //On va mettre ses deux case dans tout les cas pour laisser le joueur quitter et laisser le jeu afficher une erreur si ou autre chose que les case sont taper

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
