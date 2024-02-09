package fr_diginamic_essais;

import fr_diginamic_operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double a = 42;
        double b = 7;

        // Test des opérations
        System.out.println("Addition : " + Operations.calcul(a, b, '+'));
        System.out.println("Soustraction : " + Operations.calcul(a, b, '-'));
        System.out.println("Multiplication : " + Operations.calcul(a, b, '*'));
        System.out.println("Division : " + Operations.calcul(a, b, '/'));
    }
}
