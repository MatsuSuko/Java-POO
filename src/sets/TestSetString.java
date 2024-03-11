package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        // Instanciation d'un HashSet de String et ajout des éléments
        Set<String> setPays = new HashSet<String>();
        setPays.add("USA");
        setPays.add("France");
        setPays.add("Allemagne");
        setPays.add("UK");
        setPays.add("Italie");
        setPays.add("Japon");
        setPays.add("Chine");
        setPays.add("Russie");
        setPays.add("Inde");

        // Recherche du pays dans cette liste qui a le plus grand nombre de lettres
        String max = "";
        for (String pays : setPays) {
            if (pays.length() > max.length()) {
                max = pays;
            }
        }
        System.out.println("Pays avec le plus grand nombre de lettres : " + max);

        // Suppression de ce pays
        setPays.remove(max);

        // Affichage du contenu de la collection ainsi modifiée
        System.out.println("Contenu de la collection après suppression du pays avec le plus grand nombre de lettres : " + setPays);
    }
}
