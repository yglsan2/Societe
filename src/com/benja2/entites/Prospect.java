package com.benja2.entites;

import java.time.LocalDate;
import Utilitaires.*;
import com.benja2.entites.Utilitaires.ImmuInteresse;

/**
 * Classe représentant un Prospect, qui hérite de la classe Societe.
 * Un prospect inclut des informations sur la date de prospection
 * et s'il est potentiellement intéressé.
 */
public class Prospect extends Societe {

    private static int compteur = 0; // Compteur pour générer des identifiants uniques
    private LocalDate dateProspection; // Date de prospection du prospect
    private String prospectInteresse; // Indique si le prospect est intéressé ou non

    /**
     * Constructeur principal avec validation des paramètres.
     *
     * @param raisonSociale      La raison sociale de la société.
     * @param adresse            L'adresse de la société.
     * @param telephone          Le numéro de téléphone.
     * @param email              L'adresse email.
     * @param commentaire        Les commentaires associés.
     * @param dateProspection    La date de prospection.
     * @param prospectInteresse  Indique si le prospect est intéressé.
     */
    public Prospect(String raisonSociale, Adresse adresse, String telephone, String email,
                    String commentaire, LocalDate dateProspection, String prospectInteresse) {
        super(++compteur, raisonSociale, adresse, telephone, email, commentaire);

        try {
            if (dateProspection == null) {
                throw new ExceptionClass("La date de prospection ne peut pas être null.");
            }
            this.dateProspection = dateProspection;

            if (prospectInteresse == null || prospectInteresse.trim().isEmpty()) {
                throw new ExceptionClass("Le champ 'prospectIntéressé' ne peut pas être vide ou null.");
            }
            this.prospectInteresse = prospectInteresse;

        } catch (ExceptionClass e) {
            System.err.println("Erreur : ExceptionClass rencontrée." + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erreur : Exception générale levée." + e.getMessage());
        } finally {
            System.out.println("Validation terminée pour le constructeur de Prospect.");
        }
    }

    public Prospect(String number, String rueDesBoufflers, String number1, String nancy, String commentaire, String number2, String mail, String premierContact, LocalDate now, ImmuInteresse immuInteresse) {
    }

    /**
     * Getter pour la date de prospection.
     *
     * @return La date de prospection.
     */
    public LocalDate getDateProspection() {
        return dateProspection;
    }

    /**
     * Setter pour la date de prospection avec validation.
     *
     * @param dateProspection    La date de prospection à définir.
     */
    public void setDateProspection(LocalDate dateProspection) {
        try {
            if (dateProspection == null) {
                throw new ExceptionClass("La date de prospection ne peut pas être null.");
            }
            this.dateProspection = dateProspection;

        } catch (ExceptionClass e) {
            System.err.println("Erreur : ExceptionClass rencontrée dans setDateProspection." + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erreur : Exception générale dans setDateProspection." + e.getMessage());
        } finally {
            System.out.println("Exécution terminée pour setDateProspection.");
        }
    }

    /**
     * Getter pour savoir si le prospect est intéressé.
     *
     * @return Le statut du prospect (intéressé ou non).
     */
    public String getProspectInteresse() {
        return prospectInteresse;
    }

    /**
     * Setter pour le champ 'prospectInteresse' avec validation.
     *
     * @param prospectInteresse   Le statut à définir.
     */
    public void setProspectInteresse(String prospectInteresse) {
        try {
            if (prospectInteresse == null || prospectInteresse.trim().isEmpty()) {
                throw new ExceptionClass("Le champ 'prospectIntéressé' ne peut pas être vide ou null.");
            }
            this.prospectInteresse = prospectInteresse;

        } catch (ExceptionClass e) {
            System.err.println("Erreur : ExceptionClass rencontrée dans setProspectInteresse." + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erreur : Exception générale dans setProspectInteresse." + e.getMessage());
        } finally {
            System.out.println("Exécution terminée pour setProspectInteresse.");
        }
    }

    /**
     * Redéfinition de la méthode toString.
     * <p>
     * @ * @return La représentation sous forme de chaîne de caractères de l'objet Prospect.
     */
    @Override
    public String toString() {
        return "Prospect{" +
                "compteur=" + compteur +
                ", dateProspection=" + dateProspection +
                ", prospectInteresse='" + prospectInteresse + '\'' +
                '}';
    }

    @Override
    public void afficher() {

    }

    /**
     * Méthode pour afficher les informations du prospect.
     */
    public void afficherProspect() {
        System.out.println("Informations du prospect :");
        System.out.println("Raison sociale : " + getRaisonSociale());
        System.out.println("Adresse : " + getAdresse());
        System.out.println("Téléphone : " + getTelephone());
        System.out.println("Email : " + getEmail());
        System.out.println("Commentaire : " + getCommentaire());
        System.out.println("Date de prospection : " + getDateProspection());
        System.out.println("Prospect intéressé : " + getProspectInteresse());
    }
}