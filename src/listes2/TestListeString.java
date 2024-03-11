package listes2;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        // Création de l'ArrayList de String et ajout des éléments
        ArrayList<String> listeVilles = new ArrayList<String>();
        listeVilles.add("Nice");
        listeVilles.add("Carcassonne");
        listeVilles.add("Narbonne");
        listeVilles.add("Lyon");
        listeVilles.add("Foix");
        listeVilles.add("Pau");
        listeVilles.add("Marseille");
        listeVilles.add("Tarbes");

        // Recherche de la ville avec le plus grand nombre de lettres
        String villeMax = listeVilles.get(0);
        for (int i = 1; i < listeVilles.size(); i++) {
            if (listeVilles.get(i).length() > villeMax.length()) {
                villeMax = listeVilles.get(i);
            }
        }
        System.out.println("Ville avec le plus grand nombre de lettres : " + villeMax);

        // Mise en majuscules de tous les noms de villes
        for (int i = 0; i < listeVilles.size(); i++) {
            listeVilles.set(i, listeVilles.get(i).toUpperCase());
        }

        // Suppression des villes commençant par la lettre 'N'
        for (int i = 0; i < listeVilles.size(); i++) {
            if (listeVilles.get(i).startsWith("N")) {
                listeVilles.remove(i);
                i--; // Pour compenser le décalage des indices après la suppression
            }
        }

        // Affichage de la liste résultante
        System.out.println("Liste résultante : " + listeVilles);
    }
}
