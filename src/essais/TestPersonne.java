package essais;

import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        // Instanciation de deux objets Personne en utilisant le second constructeur
        Personne personne1 = new Personne("Bounmy", "Souvanny", 12, "rue de blablabla", "85700", "Les Herbiers");

        Personne personne2 = new Personne("Lafore", "Léo", 38, "avenue des blablabla", "85700", "Cholet");

        System.out.println("Affichage de la première personne : ");
        afficherPersonne(personne1);

        System.out.println("\n\nAffichage de la deuxième personne : ");
        afficherPersonne(personne2);
    }

    // Méthode pour afficher une personne
    private static void afficherPersonne(Personne personne) {
        if (personne != null) {
            System.out.println("Prénom      : " + personne.getPrenom());
            System.out.println("Nom         : " + personne.getNom());
            System.out.print("Adresse : \n");
            afficherAdresse(personne.getAdressePostale());
        } else {
            System.out.println("La personne est invalide.");
        }
    }

    // Méthode pour afficher une adresse postale
    private static void afficherAdresse(AdressePostale adresse) {
        if (adresse != null) {
            System.out.println("Numéro de rue   : " + adresse.getNumeroDeRue());
            System.out.println("Libellé de la rue : " + adresse.getLibelleDeLaRue());
            System.out.println("Code Postal    : " + adresse.getCodePostal());
            System.out.println("Ville          : " + adresse.getVille());
        } else {
            System.out.println("L'adresse est invalide.");
        }
    }
}
