
package com.benja2.entites;

public class Client extends Societe {
    private final long chiffreAffaires;
    private final int nombreEmployes;

    // Constructeur principal
    public Client(String raisonSociale, Adresse adresse, String telephone, String email, long chiffreAffaires, int nombreEmployes) {
        super(raisonSociale, adresse, telephone, email);

        if (chiffreAffaires <= 200) {
            throw new IllegalArgumentException("Le chiffre d'affaires doit être supérieur à 200.");
        }
        if (nombreEmployes <= 0) {
            throw new IllegalArgumentException("Le nombre d'employés doit être supérieur à zéro.");
        }

        this.chiffreAffaires = chiffreAffaires;
        this.nombreEmployes = nombreEmployes;
    }

    // Constructeur surchargé avec valeurs par défaut
    public Client(String number, String rueDesRamen, String raisonSociale, String telephone, long chiffreAffaires, int nombreEmployes) {
        this(raisonSociale, new Adresse(), telephone, "email@duclient.com", chiffreAffaires, nombreEmployes);
    }

    // Getters
    public long getChiffreAffaires() {
        return chiffreAffaires;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    // Méthode afficher
    @Override
    public void afficher() {

    }

    // Méthode toString enrichie
    @Override
    public String toString() {
        return super.toString() + ", Chiffre d'Affaires : " + chiffreAffaires + ", Nombre d'Employés : " + nombreEmployes;
    }
}

