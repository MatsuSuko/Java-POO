package fr_diginamic_banque_entites;

public class CompteTaux extends Compte {
    private double tauxDeRemuneration;

    public CompteTaux(long numeroDeCompte, double soldeDuCompte, double tauxDeRemuneration) {
        super(numeroDeCompte, soldeDuCompte);
        this.tauxDeRemuneration = tauxDeRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + " CompteTaux{" +
                "tauxDeRemuneration=" + tauxDeRemuneration +
                '}';
    }
}
