package com.benja2.ProjetSociete1;



public class Client extends SocieteDurand {
    private long chiffreAffaires;
    private int nombreEmployes;

    public Client(Adresse adresse, String raisonSociale, String telephone, String email, String commentaires, long chiffreAffaires, int nombreEmployes) {
             super(adresse, raisonSociale, telephone, email, commentaires);

                  if (chiffreAffaires <= 200) {
            throw new IllegalArgumentException("Le chiffre d'affaires doit être supérieur à 200.");
        }
                  if (nombreEmployes <= 0) {
            throw new IllegalArgumentException("Le nombre d'employés doit être supérieur à zéro.");
        }
        this.chiffreAffaires = chiffreAffaires;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters
    public long getChiffreAffaires() {
        return chiffreAffaires;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chiffre d'Affaires: " + chiffreAffaires + ", Nombre d'Employés: " + nombreEmployes;
    }

    @Override
    public void afficher() {
        System.out.println(this.toString());
    }
}
// 2 pb