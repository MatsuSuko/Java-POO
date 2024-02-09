package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        // Utilisation du constructeur avec les 4 paramètres
        AdressePostale adresse1 = new AdressePostale();
        adresse1.setNumeroDeRue(0);
        adresse1.setLibelleDeLaRue("");
        adresse1.setCodePostal("");
        adresse1.setVille("");

        AdressePostale adresse2 = new AdressePostale(4, "Place de léglise", "85700", "Pouzauges");

        System.out.println("Affichage de la première adresse : ");
        afficherAdresse(adresse1);

        System.out.println("\n\nAffichage de la deuxième adresse : ");
        afficherAdresse(adresse2);
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