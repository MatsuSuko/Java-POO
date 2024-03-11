package CreationLibrairies;

public class EnsembleTableauTest {
    public static void main(String[] args) {
        Ensemble<Integer> ensemble = new EnsembleTableau<>(5);

        System.out.println("Ajout d'éléments :");
        ensemble.ajouter(1);
        ensemble.ajouter(2);
        ensemble.ajouter(3);
        ensemble.ajouter(4);
        ensemble.ajouter(5);
        ensemble.ajouter(6); // Ne doit pas être ajouté car la taille max est atteinte

        System.out.println("Est-il vide ? " + ensemble.estVide());
        System.out.println("Appartient-il à l'ensemble ? " + ensemble.appartient(4));
        System.out.println("Taille de l'ensemble : " + ensemble.taille());
        System.out.println("Taille max de l'ensemble : " + ensemble.tailleMax());

        Ensemble<Integer> ensembleCopie = ensemble.copie();
        System.out.println("Copie de l'ensemble :");
        System.out.println("Taille de la copie : " + ensembleCopie.taille());

        System.out.println("Retirer un élément :");
        System.out.println("Sommet de l'ensemble : " + ensemble.retournerEnlever());
        System.out.println("Taille de l'ensemble : " + ensemble.taille());

        Ensemble<Integer> ensemble2 = new EnsembleTableau<>(5);
        ensemble2.ajouter(5);
        ensemble2.ajouter(6);
        ensemble2.ajouter(7);
        System.out.println("Fusion de deux ensembles :");
        ensemble.fusionner(ensemble2);
        System.out.println("Taille de l'ensemble après fusion : " + ensemble.taille());
    }
}