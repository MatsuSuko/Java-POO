package CreationLibrairies;

public interface Pile<T> {
    void ajouter(T element);
    boolean estVide();
    T sommet();
    T depiler();
    int taille();
    int tailleMax();
}