package fr_diginamic_banque_entites;

public class Compte {
    protected final long numeroDeCompte;
    protected double soldeDuCompte;

    public Compte(long numeroDeCompte, double soldeDuCompte) {
        this.numeroDeCompte = numeroDeCompte;
        this.soldeDuCompte = soldeDuCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroDeCompte=" + numeroDeCompte +
                ", soldeDuCompte=" + soldeDuCompte +
                '}';
    }

    public long getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public double getSoldeDuCompte() {
        return soldeDuCompte;
    }
}
