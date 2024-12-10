package com.benja2.entites;

import com.benja2.entites.Utilitaires.ImmuInteresse;

import java.time.LocalDate;

public class Prospect extends Societe {

    private LocalDate dateProspection;
    private ImmuInteresse interesse;
    private String commentaire;

    // Constructeur surchargé avec des éléments de l'adresse et autres champs
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
        this.commentaire = commentaire;
    }


    // Getters et Setters pour les champs supplémentaires
    public LocalDate getDateProspection() {
        return dateProspection;
    }

    public void setDateProspection(LocalDate dateProspection) {
        if (dateProspection == null) {
            throw new IllegalArgumentException("La date de prospection ne peut pas être nulle.");
        }
        this.dateProspection = dateProspection;
    }

    public ImmuInteresse getInteresse() {
        return interesse;
    }

    public void setInteresse(ImmuInteresse interesse) {
        if (interesse == null) {
            throw new IllegalArgumentException("L'intérêt ne peut pas être nul.");
        }
        this.interesse = interesse;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return super.toString() + " | Date de prospection: " + dateProspection + " | Intéressé: " + interesse.name() + " | Commentaire: " + commentaire;
    }

    @Override
    public void afficher() {
        System.out.println(this);
    }
}
