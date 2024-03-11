package CreationLibrairies;

import java.util.Objects;

public class PileTableau<T> implements Pile<T> {
    private T[] tableau;
    private int taille;
    private int tailleMax;

    public PileTableau(int tailleMax) {
        this.tableau = (T[]) new Object[tailleMax];
        this.tailleMax = tailleMax;
        this.taille = 0;
    }

    @Override
    public void ajouter(T element) {
        if (taille < tailleMax) {
            tableau[taille] = element;
            taille++;
        }
    }

    @Override
    public boolean estVide() {
        return taille == 0;
    }

    @Override
    public T sommet() {
        if (estVide()) {
            throw new IllegalStateException("La pile est vide");
        }
        return tableau[taille - 1];
    }

    @Override
    public T depiler() {
        if (estVide()) {
            throw new IllegalStateException("La pile est vide");
        }
        T element = tableau[taille - 1];
        tableau[taille - 1] = null;
        taille--;
        return element;
    }

    @Override
    public int taille() {
        return taille;
    }

    @Override
    public int tailleMax() {
        return tailleMax;
    }
}
