package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

    @Override
    public int compare(Pays p1, Pays p2) {
        return Integer.compare(p1.getNbHabitants(), p2.getNbHabitants());
    }
}