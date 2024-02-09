package fr_diginamic_banque;

import fr_diginamic_banque_entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        // Création d'une instance de la classe Compte avec un numéro et un solde aléatoires
        Compte monCompte = new Compte(1234567890, 17000);

        // Afficher l'instance créée avec System.out.println(...)
        System.out.println("Instance de Compte : " + monCompte);
    }
}
