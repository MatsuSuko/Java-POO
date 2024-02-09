package fr_diginamic_essais;

import fr_diginamic_operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        // Test de la classe CalculMoyenne
        CalculMoyenne calculMoyenne = new CalculMoyenne();

        // Ajout de valeurs au tableau
        calculMoyenne.ajout(10);
        calculMoyenne.ajout(15);
        calculMoyenne.ajout(20);

        // Calcul et affichage de la moyenne
        System.out.println("Moyenne : " + calculMoyenne.calcul());

        // Nouveaux tests
        CalculMoyenne calculMoyenne2 = new CalculMoyenne();
        calculMoyenne2.ajout(5);
        calculMoyenne2.ajout(8);
        calculMoyenne2.ajout(12);
        calculMoyenne2.ajout(17);
        calculMoyenne2.ajout(22);
        calculMoyenne2.ajout(25);

        System.out.println("Moyenne : " + calculMoyenne2.calcul());
    }
}
