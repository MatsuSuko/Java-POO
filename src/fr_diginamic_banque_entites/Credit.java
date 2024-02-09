package fr_diginamic_banque_entites;

public class Credit extends Operation {
    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String afficherType() {
        return "Crédit";
    }

    @Override
    public String toString() {
        return "Credit{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }
}
