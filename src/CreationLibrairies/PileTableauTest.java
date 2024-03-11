package CreationLibrairies;

public class PileTableauTest {
    public static void main(String[] args) {
        Pile<Integer> pile = new PileTableau<>(5);

        System.out.println("Ajout d'éléments :");
        pile.ajouter(1);
        pile.ajouter(2);
        pile.ajouter(3);
        pile.ajouter(4);
        pile.ajouter(5);

        System.out.println("Est-elle vide ? " + pile.estVide());
        System.out.println("Sommet de la pile : " + pile.sommet());
        System.out.println("Taille de la pile : " + pile.taille());
        System.out.println("Taille max de la pile : " + pile.tailleMax());

        System.out.println("Dépiler un élément :");
        System.out.println("Sommet de la pile : " + pile.sommet());
        System.out.println("Taille de la pile : " + pile.taille());

        Pile<Integer> pile2 = new PileTableau<>(5);
        pile2.ajouter(5);
        pile2.ajouter(6);
        pile2.ajouter(7);
        System.out.println("Empiler une pile sur une autre pile :");
        // pile.ajouterAll(pile2);
        System.out.println("Taille de la pile après empilement : " + pile.taille());
    }
}