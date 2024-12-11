package com.benja2.entites;

import com.benja2.entites.Utilitaires.ImmuInteresse;

import java.time.LocalDate;

public class Prospect extends Societe {

    private LocalDate dateProspection;
    private ImmuInteresse interesse;
    private String commentaire;

    // Constructeur principal
    public Prospect(String numeroRue, String nomRue, String codePostal, String ville, String raisonSociale,
                    String telephone, String email, String commentaire, LocalDate dateProspection, ImmuInteresse interesse) {
        super(raisonSociale, new Adresse(numeroRue, nomRue, codePostal, ville), telephone, email);

        // Validation des champs spécifiques à Prospect
        if (dateProspection == null) {
            throw new IllegalArgumentException("La date de prospection ne peut pas être nulle.");
        }
        if (interesse == null) {
            throw new IllegalArgumentException("L'intérêt ne peut pas être nul.");
        }

        this.dateProspection = dateProspection;
        this.interesse = interesse;
        this.commentaire = commentaire != null ? commentaire : ""; // Evite un commentaire null
    }

    // Getters
    public LocalDate getDateProspection() {
        return dateProspection;
    }

    public ImmuInteresse getInteresse() {
        return interesse;
    }

    public String getCommentaire() {
        return commentaire;
    }

    // Setters
    public void setDateProspection(LocalDate dateProspection) {
        if (dateProspection == null) {
            throw new IllegalArgumentException("La date de prospection ne peut pas être nulle.");
        }
        this.dateProspection = dateProspection;
    }

    public void setInteresse(ImmuInteresse interesse) {
        if (interesse == null) {
            throw new IllegalArgumentException("L'intérêt ne peut pas être nul.");
        }
        this.interesse = interesse;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire != null ? commentaire : ""; // Prévenir un commentaire null
    }

    // Méthode toString enrichie
    @Override
    public String toString() {
        return super.toString() +
                " | Date de prospection: " + dateProspection +
                " | Intéressé: " + interesse.name() +
                " | Commentaire: " + (commentaire.isEmpty() ? "Aucun" : commentaire);
    }

    // Méthode d'affichage spécifique
    @Override
    public void afficher() {
        System.out.println(this);
    }
}
















