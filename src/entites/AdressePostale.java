package entites;

public class AdressePostale {
    // Attributs privés
    private int numeroDeRue;
    private String libelleDeLaRue;
    private String codePostal;
    private String ville;

    // Constructeur sans argument
    public AdressePostale() {}

    // Constructeur avec tous les arguments
    public AdressePostale(int numeroDeRue, String libelleDeLaRue, String codePostal, String ville) {
        this.numeroDeRue = numeroDeRue;
        this.libelleDeLaRue = libelleDeLaRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // Getters et Setters pour chaque attribut
    public int getNumeroDeRue() { return numeroDeRue; }
    public void setNumeroDeRue(int numeroDeRue) { this.numeroDeRue = numeroDeRue; }

    public String getLibelleDeLaRue() { return libelleDeLaRue; }
    public void setLibelleDeLaRue(String libelleDeLaRue) { this.libelleDeLaRue = libelleDeLaRue; }

    public String getCodePostal() { return codePostal; }
    public void setCodePostal(String codePostal) { this.codePostal = codePostal; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }
}