package sets;

import java.util.HashSet;
import java.util.Set;

public class TestPays {
    public static void main(String[] args) {
        Set<Pays> paysSet = new HashSet<>();

        // Ajout des pays
        paysSet.add(new Pays("USA", 331_000_000, 64_500));
        paysSet.add(new Pays("France", 67_000_000, 38_500));
        paysSet.add(new Pays("Allemagne", 83_000_000, 46_000));
        paysSet.add(new Pays("UK", 66_000_000, 40_000));
        paysSet.add(new Pays("Italie", 60_000_000, 31_000));
        paysSet.add(new Pays("Japon", 126_000_000, 39_000));
        paysSet.add(new Pays("Chine", 1_439_000_000, 10_000));
        paysSet.add(new Pays("Russie", 145_000_000, 11_000));
        paysSet.add(new Pays("Inde", 1_380_000_000, 2_100));

        // Recherche du pays avec le PIB/habitant le plus important
        Pays paysPibHabMax = null;
        for (Pays pays : paysSet) {
            if (paysPibHabMax == null || pays.getPibHabitant() > paysPibHabMax.getPibHabitant()) {
                paysPibHabMax = pays;
            }
        }
        System.out.println("Le pays avec le PIB/habitant le plus important est : " + paysPibHabMax.getNom());

        // Recherche du pays avec le PIB total le plus important
        Pays paysPibTotalMax = null;
        for (Pays pays : paysSet) {
            double pibTotal = pays.getNbHabitants() * pays.getPibHabitant();
            if (paysPibTotalMax == null || pibTotal > paysPibTotalMax.getNbHabitants() * paysPibTotalMax.getPibHabitant()) {
                paysPibTotalMax = pays;
            }
        }
        System.out.println("Le pays avec le PIB total le plus important est : " + paysPibTotalMax.getNom());

        // Modification du contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
        Pays paysPibTotalMin = null;
        for (Pays pays : paysSet) {
            double pibTotal = pays.getNbHabitants() * pays.getPibHabitant();
            if (paysPibTotalMin == null || pibTotal < paysPibTotalMin.getNbHabitants() * paysPibTotalMin.getPibHabitant()) {
                paysPibTotalMin = pays;
            }
        }
        String nomPaysMin = paysPibTotalMin.getNom().toUpperCase();
        paysSet.remove(paysPibTotalMin);
        paysSet.add(new Pays(nomPaysMin, paysPibTotalMin.getNbHabitants(), paysPibTotalMin.getPibHabitant()));

        // Suppression du pays dont le PIB total est le plus petit
        Pays paysToRemove = null;
        double pibTotalMin = Double.MAX_VALUE;
        for (Pays pays : paysSet) {
            double pibTotal = pays.getNbHabitants() * pays.getPibHabitant();
            if (pibTotal < pibTotalMin) {
                pibTotalMin = pibTotal;
                paysToRemove = pays;
            }
        }
        paysSet.remove(paysToRemove);

        // Affichage du contenu du HashSet
        System.out.println("Contenu du HashSet : ");
        for (Pays pays : paysSet) {
            System.out.println(pays);
        }
    }
}
