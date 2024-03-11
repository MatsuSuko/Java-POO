package CreationLibrairies;

import java.util.Objects;

public class EnsembleTableau<T> implements Ensemble<T> {
    private T[] tableau;
    private int taille;
    private int tailleMax;

    public EnsembleTableau(int tailleMax) {
        this.tableau = (T[]) new Object[tailleMax];
        this.tailleMax = tailleMax;
        this.taille = 0;
    }

    @Override
    public void ajouter(T element) {
        if (taille < tailleMax && !appartient(element)) {
            tableau[taille] = element;
            taille++;
        }
    }

    @Override
    public boolean estVide() {
        return taille == 0;
    }

    @Override
    public boolean appartient(T element) {
        for (int i = 0; i < taille; i++) {
            if (Objects.equals(tableau[i], element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int taille() {
        return taille;
    }

    @Override
    public int tailleMax() {
        return tailleMax;
    }

    @Override
    public Ensemble<T> copie() {
        EnsembleTableau<T> ensembleCopie = new EnsembleTableau<>(tailleMax);
        System.arraycopy(tableau, 0, ensembleCopie.tableau, 0, taille);
        ensembleCopie.taille = taille;
        return ensembleCopie;
    }

    @Override
    public T retournerEnlever() {
        if (estVide()) {
            throw new IllegalStateException("L'ensemble est vide");
        }
        int index = -1;
        for (int i = 0; i < taille; i++) {
            if (tableau[i] != null) {
                index = i;
                break;
            }
        }
        T element = tableau[index];
        tableau[index] = null;
        taille--;
        return element;
    }

    @Override
    public void fusionner(Ensemble<T> autreEnsemble) {
        for (int i = 0; i < autreEnsemble.taille(); i++) {
            if (!appartient(autreEnsemble.retournerEnlever())) {
                ajouter(autreEnsemble.retournerEnlever());
            }
        }
    }
}
