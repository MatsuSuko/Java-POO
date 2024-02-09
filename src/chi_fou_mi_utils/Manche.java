package chi_fou_mi_utils;

public class Manche {
    private Joueur joueur; // Le joueur de la manche
    private Bot bot; // Le bot de la manche

    // Constructeur de la classe Manche
    public Manche(Joueur joueur, Bot bot) {
        this.joueur = joueur; // Initialise le joueur de la manche
        this.bot = bot; // Initialise le bot de la manche
    }

    // Méthode pour jouer une manche
    public int jouer() {
        int choixJoueur = joueur.choisir(); // Le joueur fait un choix
        int choixBot = bot.choisir(); // Le bot fait un choix aléatoire

        joueur.afficherChoix(choixJoueur); // Affiche le choix du joueur
        System.out.println(bot.getNom() + " a choisi : " + choixBot); // Affiche le choix du bot

        return determinerVainqueur(choixJoueur, choixBot); // Renvoie le vainqueur de la manche
    }

    // Méthode privée pour déterminer le vainqueur de la manche
    private int determinerVainqueur(int choixJoueur, int choixBot) {
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
