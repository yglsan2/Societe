package com.benja2.entites;

public class Client extends Societe {
    private final long chiffreAffaires;
    private final int nombreEmployes;

    // Constructeur principal
    public Client(String adresse, String raisonSociale, String telephone, String email, String commentaires, long chiffreAffaires, int nombreEmployes) {
        super();

        if (chiffreAffaires <= 200) {
            throw new IllegalArgumentException("Le chiffre d'affaires doit être supérieur à 200.");
        }
        if (nombreEmployes <= 0) {
            throw new IllegalArgumentException("Le nombre d'employés doit être supérieur à zéro.");
        }

        this.chiffreAffaires = chiffreAffaires;
        this.nombreEmployes = nombreEmployes;
    }

    // Constructeur surchargé avec valeurs par défaut pour certains champs
    public Client(String raisonSociale, String telephone, long chiffreAffaires, int nombreEmployes) {
        this("Adresse non définie", raisonSociale, telephone, "Email non défini", "Aucun commentaire", chiffreAffaires, nombreEmployes);
    }

    // Constructeur surchargé pour un client sans téléphone ni email
    public Client(String raisonSociale, long chiffreAffaires, int nombreEmployes) {
        this(raisonSociale, "Téléphone non défini", chiffreAffaires, nombreEmployes);
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
        System.out.println("Client :");
        System.out.println("Identifiant : " + getIdentifiant());
        System.out.println("Raison Sociale : " + getRaisonSociale());
        System.out.println("Adresse : " + getAdresse());
        System.out.println("Téléphone : " + getTelephone());
        System.out.println("Email : " + getEmail());
        System.out.println("Commentaires : " + getCommentaires());
        System.out.println("Chiffre d'Affaires : " + chiffreAffaires);
        System.out.println("Nombre d'Employés : " + nombreEmployes);
    }

    // Méthode toString enrichie
    @Override
    public String toString() {
        return super.toString() + ", Chiffre d'Affaires : " + chiffreAffaires + ", Nombre d'Employés : " + nombreEmployes;
    }
}
























