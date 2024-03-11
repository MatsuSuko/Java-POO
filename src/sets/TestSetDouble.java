package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
    public static void main(String[] args) {
        // Instanciation d'un HashSet de doubles et ajout des éléments
        Set<Double> setDoubles = new HashSet<Double>();
        setDoubles.add(1.5);
        setDoubles.add(8.25);
        setDoubles.add(-7.32);
        setDoubles.add(13.3);
        setDoubles.add(-12.45);
        setDoubles.add(48.5);
        setDoubles.add(0.01);

        // Affichage des éléments de la collection
        System.out.println("Éléments de la collection : " + setDoubles);

        // Recherche du plus grand élément de la collection
        Double max = setDoubles.stream().max(Double::compare).get();
        System.out.println("Plus grand élément : " + max);

        // Suppression du plus petit élément de la collection
        Double min = setDoubles.stream().min(Double::compare).get();
        setDoubles.remove(min);

        // Affichage du contenu de la collection ainsi modifiée
        System.out.println("Contenu de la collection après suppression du plus petit élément : " + setDoubles);
    }
}
