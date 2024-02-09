package fr_diginamic_entites;

public class Cercle {
    private double rayon;

    // Constructeur avec le rayon en paramètre
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Méthode pour calculer le périmètre du cercle
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    // Méthode pour calculer la surface du cercle
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}
