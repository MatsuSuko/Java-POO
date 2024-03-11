package CreationLibrairies;

import java.util.ArrayList;
import java.util.Objects;

public class EnsembleList<T> implements Ensemble<T> {
    private ArrayList<T> liste;

    public EnsembleList() {
        this.liste = new ArrayList<>();
    }

    @Override
    public void ajouter(T element) {
        if (!liste.contains(element)) {
            liste.add(element);
        }
    }

    @Override
    public boolean estVide() {
        return liste.isEmpty();
    }

    @Override
    public boolean appartient(T element) {
        return liste.contains(element);
    }

    @Override
    public int taille() {
        return liste.size();
    }

    @Override
    public int tailleMax() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Ensemble<T> copie() {
        EnsembleList<T> ensembleCopie = new EnsembleList<>();
        ensembleCopie.liste.addAll(liste);
        return ensembleCopie;
    }

    @Override
    public T retournerEnlever() {
        if (estVide()) {
            throw new IllegalStateException("L'ensemble est vide");
        }
        T element = liste.get(0);
        liste.remove(0);
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
