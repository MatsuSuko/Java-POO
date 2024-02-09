package fr.diginamic.essais;

import fr_diginamic_entites.Cercle;
import fr_diginamic_utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        // Utilisation de la méthode statique de CercleFactory pour créer les cercles
        Cercle cercle1 = CercleFactory.creerCercle(6);
        Cercle cercle2 = CercleFactory.creerCercle(9);

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
