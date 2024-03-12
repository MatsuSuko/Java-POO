package tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

    @Override
    public int compare(Pays p1, Pays p2) {
        return Double.compare(p1.getPibHabitant(), p2.getPibHabitant());
    }
}