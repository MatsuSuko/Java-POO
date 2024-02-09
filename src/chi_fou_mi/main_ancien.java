package chi_fou_mi;

import java.util.Random;
import java.util.Scanner;

public class main_ancien {
    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("----------CHI-FOU-MI----------");
        System.out.println("------------------------------");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Demander le nom du joueur
        System.out.print("Entrez votre nom : ");
        String nomJoueur = scanner.nextLine();

        // Nommer le bot
        String nomBot = "Bot";

        // Score des joueurs
        int scoreJoueur = 0;
        int scoreBot = 0;

        // Boucle de jeu sur 3 manches
        int manche = 1;
        while (manche <= 3) {
            System.out.println("\nManche " + manche + " :");

            // Laisser le joueur choisir un nombre
            System.out.println("Choisissez un nombre :");
            System.out.println("1. Pierre");
            System.out.println("2. Feuille");
            System.out.println("3. Ciseaux");
            System.out.print("Votre choix : ");
            int choixJoueur = scanner.nextInt();

            // Générer le choix aléatoire du bot
            int choixBot = random.nextInt(3) + 1;

            // Afficher les choix du joueur et du bot
            System.out.println(nomJoueur + " a choisi : " + getNomChoix(choixJoueur));
            System.out.println(nomBot + " a choisi : " + getNomChoix(choixBot));

            // Déterminer le vainqueur de la manche
            int resultat = determinerVainqueur(choixJoueur, choixBot);
            if (resultat == 0) {
                System.out.println("Manche nulle ! Rejouons cette manche.");
                continue; // Rejouer la même manche en cas d'égalité
            } else if (resultat == 1) {
                System.out.println(nomJoueur + " remporte la manche !");
                scoreJoueur++;
            } else {
                System.out.println(nomBot + " remporte la manche !");
                scoreBot++;
            }

            // Passer à la prochaine manche
            manche++;
        }

        // Afficher le score final
        System.out.println("\nScore final :");
        System.out.println(nomJoueur + " : " + scoreJoueur);
        System.out.println(nomBot + " : " + scoreBot);

        // Déterminer le gagnant
        if (scoreJoueur > scoreBot) {
            System.out.println(nomJoueur + " remporte la partie !");
        } else if (scoreJoueur < scoreBot) {
            System.out.println(nomBot + " remporte la partie !");
        } else {
            System.out.println("Match nul !");
        }

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour obtenir le nom du choix à partir du numéro
    public static String getNomChoix(int choix) {
        switch (choix) {
            case 1:
                return "Pierre";
            case 2:
                return "Feuille";
            case 3:
                return "Ciseaux";
            default:
                return "Choix invalide";
        }
    }

    // Méthode pour déterminer le vainqueur de la manche
    public static int determinerVainqueur(int choixJoueur, int choixBot) {
        if (choixJoueur == choixBot) {
            return 0; // Égalité
        } else if ((choixJoueur == 1 && choixBot == 3) || (choixJoueur == 2 && choixBot == 1)
                || (choixJoueur == 3 && choixBot == 2)) {
            return 1; // Le joueur gagne
        } else {
            return -1; // Le bot gagne
        }
    }
}
