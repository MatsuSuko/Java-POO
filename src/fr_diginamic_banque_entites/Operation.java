package fr_diginamic_banque_entites;

public abstract class Operation {
    protected String date;
    protected double montant;

    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public abstract String afficherType();

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }

    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }
}
