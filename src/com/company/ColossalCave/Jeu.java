package com.company.ColossalCave;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Jeu {
    public static void jeu() {
        String newLine = System.getProperty("line.separator");
        Scanner mouvement = new Scanner(System.in);
        String entreeUtilisateur = mouvement.nextLine();
        ArrayList salle = new ArrayList();
        salle.add(" Vous êtes au bout de la route devant un petit immeuble en brique. Un petit ruisseau coule a côté du building en bas d’une rigole."
                + newLine +
                "Depuis cet endroit, vous pouvez aller au nord pour aller dans la fôret, au sud pour aller dans la vallée, à l'est pour aller au building en brique ou à l'ouest pour aller dans colline.");
        salle.add(" Vous êtes tout en haut d’une colline qui surplombe la ville, au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau."
                + newLine +
                "Depuis cet endroit, vous pouvez fuir au nord pour aller dans la fôret.");
        salle.add("Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes. Un homme git là au milieu d’une marre");
    }
}