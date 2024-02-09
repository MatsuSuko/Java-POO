package fr_diginamic_utils;

import fr_diginamic_entites.Cercle;

public class CercleFactory {
    // Méthode de classe qui prend en paramètre un rayon (double) et retourne un objet Cercle
    public static Cercle creerCercle(double rayon) {
        return new Cercle(rayon);
    }
}