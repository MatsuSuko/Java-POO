package fr_diginamic_operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] tableau;
    private int taille;
    private static final int CAPACITE_INITIALE = 10;

    public CalculMoyenne() {
        this.tableau = new double[CAPACITE_INITIALE];
        this.taille = 0;
    }

    public void ajout(double nombre) {
        if (taille == tableau.length) {
            tableau = Arrays.copyOf(tableau, tableau.length * 2);
        }
        tableau[taille++] = nombre;
    }

    public double calcul() {
        if (taille == 0) {
            return 0;
        }
        double somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }
        return somme / taille;
    }
}
