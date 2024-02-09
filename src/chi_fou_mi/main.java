package chi_fou_mi;

import chi_fou_mi_utils.Bot;
import chi_fou_mi_utils.Joueur;
import chi_fou_mi_utils.Manche;
import chi_fou_mi_utils.Score;

public class main {
    public static void main(String[] args) {
        // Création des objets joueur, bot et score
        Joueur joueur = new Joueur(); // Crée un nouvel objet joueur
        Bot bot = new Bot(); // Crée un nouvel objet bot
        Score score = new Score(); // Crée un nouvel objet score

        // Appel de la méthode jouer pour démarrer le jeu
        jouer(joueur, bot, score);
    }

    // Méthode pour démarrer le jeu
    public static void jouer(Joueur joueur, Bot bot, Score score) {
        System.out.println("------------------------------");
        System.out.println("----------CHI-FOU-MI----------");
        System.out.println("------------------------------");

        // Demander le nom du joueur et le définir dans l'objet joueur
        String nomJoueur = joueur.saisirNom();
        joueur.setNom(nomJoueur);

        // Boucle pour jouer 3 manches
        for (int manche = 1; manche <= 3; manche++) {
            System.out.println("\nManche " + manche + " :");

            // Créer une nouvelle manche avec le joueur et le bot
            Manche nouvelleManche = new Manche(joueur, bot);

            // Jouer la manche et obtenir le résultat
            int resultat = nouvelleManche.jouer();

            // Traiter le résultat de la manche
            if (resultat == 0) {
                System.out.println("Manche nulle ! Rejouons cette manche.");
                manche--; // Rejouer la même manche en cas d'égalité
            } else if (resultat == 1) {
                System.out.println(joueur.getNom() + " remporte la manche !");
                score.incrScoreJoueur(); // Incrémenter le score du joueur
            } else {
                System.out.println(bot.getNom() + " remporte la manche !");
                score.incrScoreBot(); // Incrémenter le score du bot
            }
        }

        // Afficher le score final
        score.afficherScoreFinal(joueur.getNom(), bot.getNom());
    }
}
