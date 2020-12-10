package Jeu.Lieux;

import java.util.Scanner;

public class Route extends Jeu implements Salle {

    @Override
    public void lieux() {

        Scanner scanChoix = new Scanner(System.in);
        String entreeUtilisateur = scanChoix.nextLine();
        switch (entreeUtilisateur){
            case "nord":
                Foret foret = new Foret();
                foret.lieux();
                foret.description();
            case "sud":

                Vallee vallee = new Vallee();
                vallee.lieux();
                vallee.description();
            case "ouest":

                Colline colline = new Colline();
                colline.lieux();
                colline.description();
            case "est":

                Brique brique = new Brique();
                brique.lieux();
                brique.description();
        }

    }

    @Override
    public void description() {
        System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique. Un petit ruisseau coule a côté du building en bas d’une rigole.");
    }
}
