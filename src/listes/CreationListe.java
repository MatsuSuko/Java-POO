package listes;
import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        // Création de l'ArrayList d'entiers
        ArrayList<Integer> listeEntiers = new ArrayList<Integer>();

        // Ajout des nombres de 1 à 100 dans la liste
        for (int i = 1; i <= 100; i++) {
            listeEntiers.add(i);
        }

        // Affichage de la taille de la liste
        System.out.println("La taille de la liste est : " + listeEntiers.size());
    }
}
