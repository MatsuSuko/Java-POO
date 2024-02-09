package fr_diginamic_banque;

import fr_diginamic_banque_entites.Compte;
import fr_diginamic_banque_entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compteNormal = new Compte(1234567890, 17000);
        CompteTaux compteTaux = new CompteTaux(987654321, 25000, 0.05);

        Compte[] tableauComptes = new Compte[2];
        tableauComptes[0] = compteNormal;
        tableauComptes[1] = compteTaux;

        for (Compte compte : tableauComptes) {
            System.out.println(compte);
        }
    }
}
