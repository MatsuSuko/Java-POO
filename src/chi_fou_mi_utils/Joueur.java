package chi_fou_mi_utils;

import java.util.Scanner;

public class Joueur {
    private String nom; // Le nom du joueur
    private Scanner scanner; // Scanner pour lire l'entrée utilisateur

    // Constructeur de la classe Joueur
    public Joueur() {
        this.scanner = new Scanner(System.in); // Initialise le scanner pour la saisie utilisateur
    }

    // Méthode pour saisir le nom du joueur
    public String saisirNom() {
        System.out.print("Entrez votre nom : "); // Demande à l'utilisateur de saisir son nom
        return scanner.nextLine(); // Renvoie le nom saisi par l'utilisateur
    }

    // Méthode pour obtenir le nom du joueur
    public String getNom() {
        return nom; // Renvoie le nom du joueur
    }

    // Méthode pour définir le nom du joueur
    public void setNom(String nom) {
        this.nom = nom; // Définit le nom du joueur
    }

    // Méthode pour permettre au joueur de choisir une option (pierre, feuille ou ciseaux)
    public int choisir() {
        System.out.println(nom + ", choisissez un nombre :"); // Affiche le nom du joueur et la demande de choix
        System.out.println("1. Pierre");
        System.out.println("2. Feuille");
        System.out.println("3. Ciseaux");
        System.out.print("Votre choix : ");
        return scanner.nextInt(); // Renvoie le choix saisi par le joueur
    }

    // Méthode pour afficher le choix du joueur
    public void afficherChoix(int choix) {
        System.out.println(nom + " a choisi : " + getNomChoix(choix)); // Affiche le choix du joueur
    }

    // Méthode privée pour obtenir le nom de l'option choisie par le joueur
    private String getNomChoix(int choix) {
        switch (choix) {
            case 1:
                return "Pierre"; // Si choix == 1, renvoie "Pierre"
            case 2:
                return "Feuille"; // Si choix == 2, renvoie "Feuille"
            case 3:
                return "Ciseaux"; // Si choix == 3, renvoie "Ciseaux"
            default:
                return "Choix invalide"; // Sinon, renvoie "Choix invalide"
        }
    }
}
