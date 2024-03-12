package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TrierPays {

    public static void main(String[] args) {
        List<Pays> paysList = new ArrayList<>();
        paysList.add(new Pays("France", 67000000, 38500));
        paysList.add(new Pays("Allemagne", 83000000, 46000));
        paysList.add(new Pays("Italie", 60000000, 31000));
        paysList.add(new Pays("Espagne", 47000000, 28000));
        paysList.add(new Pays("Royaume-Uni", 66000000, 40000));

        System.out.println("Tri par nombre d'habitants :");
        Collections.sort(paysList, new ComparatorHabitant());
        for (Pays pays : paysList) {
            System.out.println(pays);
        }

        System.out.println("\nTri par PIB par habitant :");
        Collections.sort(paysList, new ComparatorPibHabitant());
        for (Pays pays : paysList) {
            System.out.println(pays);
        }
    }
}