package com.company.ColossalCave.Lieux;

public class Jeu {

    public static void Jeux(){
        while (true){
            System.out.println("-----------Bienvenue dans le jeu----------");
            Route route = new Route();
            route.description();
            route.lieux();
        }
    }
}
