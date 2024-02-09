package chi_fou_mi_utils;

public class Score {
    private int scoreJoueur; // Score du joueur
    private int scoreBot; // Score du bot

    // Méthode pour incrémenter le score du joueur
    public void incrScoreJoueur() {
        scoreJoueur++; // Incrémente le score du joueur
    }

    // Méthode pour incrémenter le score du bot
    public void incrScoreBot() {
        scoreBot++; // Incrémente le score du bot
    }

    // Méthode pour afficher le score final
    public void afficherScoreFinal(String nomJoueur, String nomBot) {
        System.out.println("\nScore final :");
        System.out.println(nomJoueur + " : " + scoreJoueur); // Affiche le score du joueur
        System.out.println(nomBot + " : " + scoreBot); // Affiche le score du bot

        // Détermine le gagnant en fonction des scores et affiche le résultat
        if (scoreJoueur > scoreBot) {
            System.out.println(nomJoueur + " remporte la partie !");
        } else if (scoreJoueur < scoreBot) {
            System.out.println(nomBot + " remporte la partie !");
        } else {
            System.out.println("Match nul !");
        }
    }
}
