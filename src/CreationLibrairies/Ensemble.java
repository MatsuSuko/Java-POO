package CreationLibrairies;

public interface Ensemble<T> {
    void ajouter(T element);
    boolean estVide();
    boolean appartient(T element);
    int taille();
    int tailleMax();
    Ensemble<T> copie();
    T retournerEnlever();
    void fusionner(Ensemble<T> autreEnsemble);
}

