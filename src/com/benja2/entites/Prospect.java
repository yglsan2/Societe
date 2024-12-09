package com.benja2.entites;

import com.benja2.entites.Utilitaires.ImmuInteresse;

import java.time.LocalDate;


public class Prospect extends Societe {

    private LocalDate dateProspection;
    private String interesse;

    public Prospect(String numeroRue, String nomRue, String codePostal, String ville, String raisonSociale,
                    String telephone, String email, String commentaires, LocalDate dateProspection, String interesse) {
        super(numeroRue, nomRue, codePostal, ville, raisonSociale, telephone, email, commentaires);

        // Vérification que l'intérêt soit bien "oui" ou "non"
        if (!"oui".equalsIgnoreCase(interesse) && !"non".equalsIgnoreCase(interesse)) {
            throw new IllegalArgumentException("L'intérêt doit être 'oui' ou 'non'.");
        }

        this.dateProspection = dateProspection;
        this.interesse = interesse;
    }

    public Prospect(String prospectLoP, Adresse adresse, String number, String mail, String raisonSociale, LocalDate of, ImmuInteresse immuInteresse) {
        super();
    }

    public LocalDate getDateProspection() {
        return dateProspection;
    }

    public void setDateProspection(LocalDate dateProspection) {
        this.dateProspection = dateProspection;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        if (!"oui".equalsIgnoreCase(interesse) && !"non".equalsIgnoreCase(interesse)) {
            throw new IllegalArgumentException("L'intérêt doit être 'oui' ou 'non'.");
        }
        this.interesse = interesse;
    }

    @Override
    public String toString() {
        return super.toString() + " | Date de prospection: " + dateProspection + " | Intéressé: " + interesse;
    }

    @Override
    public void afficher() {

    }
}






