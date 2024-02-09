package chi_fou_mi_utils;

import java.util.Random;

public class Bot {
    private Random random; // Objet Random pour générer des nombres aléatoires

    // Constructeur de la classe Bot
    public Bot() {
        this.random = new Random(); // Initialise l'objet Random
    }

    // Méthode pour que le bot fasse un choix aléatoire (pierre, feuille ou ciseaux)
    public int choisir() {
        return random.nextInt(3) + 1; // Renvoie un nombre aléatoire entre 1 et 3
    }

    // Méthode pour obtenir le nom du bot
    public String getNom() {
        return "Bot"; // Renvoie le nom du bot
    }
}
