package listes2;

import java.util.ArrayList;

public class TestVille {
    public static void main(String[] args) {
        // Création de l'ArrayList de villes et ajout des éléments
        ArrayList<Ville> listeVilles = new ArrayList<Ville>();
        listeVilles.add(new Ville("Nice", 343000));
        listeVilles.add(new Ville("Carcassonne", 47800));
        listeVilles.add(new Ville("Narbonne", 53400));
        listeVilles.add(new Ville("Lyon", 484000));
        listeVilles.add(new Ville("Foix", 9700));
        listeVilles.add(new Ville("Pau", 77200));
        listeVilles.add(new Ville("Marseille", 850700));
        listeVilles.add(new Ville("Tarbes", 40600));

        // Recherche et affichage de la ville la plus peuplée
        Ville villePlusPeuplee = listeVilles.get(0);
        for (int i = 1; i < listeVilles.size(); i++) {
            if (listeVilles.get(i).getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
                villePlusPeuplee = listeVilles.get(i);
            }
        }
        System.out.println("Ville la plus peuplée : " + villePlusPeuplee);

        // Suppression de la ville la moins peuplée
        Ville villeMoinsPeuplee = listeVilles.get(0);
        int indexVilleMoinsPeuplee = 0;
        for (int i = 1; i < listeVilles.size(); i++) {
            if (listeVilles.get(i).getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
                villeMoinsPeuplee = listeVilles.get(i);
                indexVilleMoinsPeuplee = i;
            }
        }
        listeVilles.remove(indexVilleMoinsPeuplee);

        // Modification des villes de plus de 100 000 habitants en mettant leur nom en majuscules
        for (Ville ville : listeVilles) {
            if (ville.getNbHabitants() > 100000) {
                String nomMajuscule = ville.getNom().toUpperCase();
                ville.setNom(nomMajuscule);
            }
        }

        // Affichage de la liste résultante
        System.out.println("Liste résultante : " + listeVilles);
    }
}
