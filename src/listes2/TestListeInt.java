package listes2;

import java.util.ArrayList;

public class TestListeInt {
    public static void main(String[] args) {
        // Création de l'ArrayList d'entiers et ajout des éléments
        ArrayList<Integer> listeEntiers = new ArrayList<Integer>();
        listeEntiers.add(-1);
        listeEntiers.add(5);
        listeEntiers.add(7);
        listeEntiers.add(3);
        listeEntiers.add(-2);
        listeEntiers.add(4);
        listeEntiers.add(8);
        listeEntiers.add(5);

        // Affichage de tous les éléments de la liste
        System.out.println("Éléments de la liste : " + listeEntiers);

        // Affichage de la taille de la liste
        System.out.println("Taille de la liste : " + listeEntiers.size());

        // Recherche et affichage du plus grand élément de la liste
        int max = listeEntiers.get(0);
        for (int i = 1; i < listeEntiers.size(); i++) {
            if (listeEntiers.get(i) > max) {
                max = listeEntiers.get(i);
            }
        }
        System.out.println("Plus grand élément : " + max);

        // Suppression du plus petit élément de la liste et affichage du résultat
        int min = listeEntiers.get(0);
        int minIndex = 0;
        for (int i = 1; i < listeEntiers.size(); i++) {
            if (listeEntiers.get(i) < min) {
                min = listeEntiers.get(i);
                minIndex = i;
            }
        }
        listeEntiers.remove(minIndex);
        System.out.println("Liste après suppression du plus petit élément : " + listeEntiers);

        // Modification des éléments négatifs en éléments positifs
        for (int i = 0; i < listeEntiers.size(); i++) {
            if (listeEntiers.get(i) < 0) {
                listeEntiers.set(i, Math.abs(listeEntiers.get(i)));
            }
        }

        // Affichage de la liste résultante
        System.out.println("Liste résultante : " + listeEntiers);
    }
}
