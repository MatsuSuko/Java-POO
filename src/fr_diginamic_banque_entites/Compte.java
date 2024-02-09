package fr_diginamic_banque_entites;

public class Compte {
    // Attributs privés
    private long numeroDeCompte;
    private double soldeDuCompte;

    /**
     * Constructeur avec le numéro de compte et le solde.
     */
    public Compte(long numeroDeCompte, double soldeDuCompte) {
        this.numeroDeCompte = numeroDeCompte;
        this.soldeDuCompte = soldeDuCompte;
    }

    // Getter pour le numéro de compte
    public long getNumeroDeCompte() {
        return numeroDeCompte;
    }

    // Getter pour le solde du compte
    public double getSoldeDuCompte() {
        return soldeDuCompte;
    }

    /**
     * Représente l'objet {@link Compte} sous forme de chaîne de caractères.
     *
     * @return Chaîne contenant les attributs du compte formatés
     */
    @Override
    public String toString() {
        return "Compte{numéro=" + numeroDeCompte + ", solde=" + soldeDuCompte + '}';
    }
}
