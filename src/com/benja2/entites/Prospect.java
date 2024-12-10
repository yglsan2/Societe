package com.benja2.entites;
import com.benja2.entites.Utilitaires.ImmuInteresse;
import java.time.LocalDate;

public class Prospect extends Societe {

    private LocalDate dateProspection;
    private ImmuInteresse interesse;

    // Constructeur principal
    public Prospect(String raisonSociale, Adresse adresse, String telephone, String email,
                    String commentaires, LocalDate dateProspection, ImmuInteresse interesse) {
        super(raisonSociale, adresse, telephone, email, commentaires);

        if (dateProspection == null) {
            throw new IllegalArgumentException("La date de prospection ne peut pas être nulle.");
        }
        if (interesse == null) {
            throw new IllegalArgumentException("L'intérêt ne peut pas être nul.");
        }

        this.dateProspection = dateProspection;
        this.interesse = interesse;
    }

    // Méthode parseAdresse (optionnelle, utilisée pour convertir une chaîne en objet Adresse)
    private static Adresse parseAdresse(String adresse) {
        if (adresse == null || adresse.isBlank()) {
            throw new IllegalArgumentException("L'adresse ne peut pas être vide.");
        }

        String[] parts = adresse.split(", ");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Adresse invalide. Format attendu : 'numéro rue, code postal ville'.");
        }

        String[] rueParts = parts[0].split(" ", 2);
        if (rueParts.length != 2) {
            throw new IllegalArgumentException("Adresse invalide. Numéro et rue attendus.");
        }

        String[] codeVilleParts = parts[1].split(" ", 2);
        if (codeVilleParts.length != 2) {
            throw new IllegalArgumentException("Adresse invalide. Code postal et ville attendus.");
        }

        return new Adresse(rueParts[0], rueParts[1], codeVilleParts[0], codeVilleParts[1]);
    }

    // Constructeur surchargé avec Adresse
    public Prospect(String numeroRue, String nomRue, String codePostal, String ville, String raisonSociale,
                    String telephone, String email, String commentaires, LocalDate dateProspection,
                    ImmuInteresse interesse) {
        this(   raisonSociale,
                new Adresse(numeroRue, nomRue, codePostal, ville),
                telephone,
                email,
                commentaires,
                dateProspection,
                interesse
        );
    }

    // Getters et Setters
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

    // Méthode toString
    @Override
    public String toString() {
        return super.toString() + " | Date de prospection: " + dateProspection + " | Intéressé: " + interesse.name();
    }

    // Méthode afficher
    @Override
    public void afficher() {
        System.out.println(this);
    }
}
