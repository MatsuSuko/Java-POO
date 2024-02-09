package fr_diginamic_banque_entites;

public class Debit extends Operation {
    public Debit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String afficherType() {
        return "Débit";
    }

    @Override
    public String toString() {
        return "Debit{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }
}
