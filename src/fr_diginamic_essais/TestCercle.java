package fr_diginamic_essais;

import fr_diginamic_entites.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        // Instanciation de deux cercles avec des rayons différents
        Cercle cercle1 = new Cercle(7);
        Cercle cercle2 = new Cercle(21);

        // Affichage des résultats des méthodes de calcul de périmètre et de calcul de surface pour chaque cercle
        System.out.println("Cercle 1 :");
        System.out.println("Périmètre : " + cercle1.calculerPerimetre());
        System.out.println("Surface : " + cercle1.calculerSurface());

        System.out.println();

        System.out.println("Cercle 2 :");
        System.out.println("Périmètre : " + cercle2.calculerPerimetre());
        System.out.println("Surface : " + cercle2.calculerSurface());
    }
}
