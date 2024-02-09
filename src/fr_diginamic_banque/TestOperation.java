package fr_diginamic_banque;

import fr_diginamic_banque_entites.Credit;
import fr_diginamic_banque_entites.Debit;
import fr_diginamic_banque_entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        // Création d'un tableau d'opérations avec au moins 4 opérations de crédits et de débits
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("2024-02-09", 1000);
        operations[1] = new Debit("2024-02-10", 500);
        operations[2] = new Credit("2024-02-11", 1500);
        operations[3] = new Debit("2024-02-12", 200);

        // Affichage des informations des opérations avec le type de l'opération
        for (Operation operation : operations) {
            System.out.println("Type d'opération : " + operation.afficherType());
            System.out.println("Date de l'opération : " + operation.getDate());
            System.out.println("Montant de l'opération : " + operation.getMontant() + " €");
            System.out.println();
        }

        // Calcul du montant global des opérations
        double montantGlobal = 0;
        for (Operation operation : operations) {
            if (operation instanceof Credit) {
                montantGlobal += operation.getMontant();
            } else if (operation instanceof Debit) {
                montantGlobal -= operation.getMontant();
            }
        }

        // Affichage du montant global
        System.out.println("Montant global des opérations : " + montantGlobal + " €");

    }
}
