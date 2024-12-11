package com.benja2.entites;

public class Client extends Societe {
    private long chiffreAffaires;
    private int nombreEmployes;

    // Constructeur principal
    public Client(String raisonSociale, Adresse adresse, String telephone, String email, long chiffreAffaires, int nombreEmployes) {
        super(raisonSociale, adresse, telephone, email);

        try {
            // Vérification des conditions pour le chiffre d'affaires et le nombre d'employés
            if (chiffreAffaires <= 200) {
                throw new IllegalArgumentException("Le chiffre d'affaires doit être supérieur à 200.");
            }
            if (nombreEmployes <= 0) {
                throw new IllegalArgumentException("Le nombre d'employés doit être supérieur à zéro.");
            }

            this.chiffreAffaires = chiffreAffaires;
            this.nombreEmployes = nombreEmployes;

        } catch (IllegalArgumentException e) {
            // Exceptions, de légères à modérées
            System.err.println("Erreur de validation des données du client : " + e.getMessage());
        } catch (Exception e) {
            // Gestion de l'exception générale
            System.err.println("Erreur inattendue lors de la création du client : " + e.getMessage());
        } finally {
            // Log d'information
            System.out.println("[LOG] Tentative de création d'un client : " + raisonSociale);
        }
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
        // Affichage spécifique pour Client (méthode à définir)
    }

    // Méthode toString enrichie
    @Override
    public String toString() {
        return super.toString() + ", Chiffre d'Affaires : " + chiffreAffaires + ", Nombre d'Employés : " + nombreEmployes;
    }
}






