package fr_diginamic_operations;

public class Operations {
    public static double calcul(double a, double b, char operateur) {
        double resultat = 0;
        switch (operateur) {
            case '+':
                resultat = a + b;
                break;
            case '-':
                resultat = a - b;
                break;
            case '*':
                resultat = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultat = a / b;
                } else {
                    System.out.println("Division par zéro !");
                }
                break;
            default:
                System.out.println("Opérateur non reconnu !");
        }
        return resultat;
    }
}
