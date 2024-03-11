package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        // Création de liste3
        List<String> liste3 = new ArrayList<String>();

        // Ajout des éléments de liste1 à liste3
        for (String couleur : liste1) {
            liste3.add(couleur);
        }

        // Ajout des éléments de liste2 à liste3
        for (String couleur : liste2) {
            liste3.add(couleur);
        }

        // Affichage du contenu de liste3
        System.out.println("Contenu de liste3 : " + liste3);
    }
}
