package entites;

public class Personne {
    // Attributs privés
    private final String nom;
    private final String prenom;
    private final AdressePostale adressePostale;

    // Constructeur avec tous les arguments sauf adressePostale
    public Personne(final String nom, final String prenom) {
        this(nom, prenom, new AdressePostale());
    }

    // Constructeur avec tous les arguments dont adressePostale
    public Personne(final String nom, final String prenom, final AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    // Second constructeur avec nom, prenom et adresse
    public Personne(final String nom, final String prenom, final int numeroDeRue, final String libelleDeLaRue, final String codePostal, final String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = new AdressePostale(numeroDeRue, libelleDeLaRue, codePostal, ville);
    }

    // Getters pour chaque attribut
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public AdressePostale getAdressePostale() { return adressePostale; }
}
