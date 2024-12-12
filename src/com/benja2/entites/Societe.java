
package com.benja2.entites;
import Utilitaires.RegexPatt.*;
import com.benja2.entites.*;

import static Utilitaires.RegexPatt.REGEX_EMAIL;
import static Utilitaires.RegexPatt.REGEX_TELEPHONE;



public abstract class Societe {

    // Attributs en protected pour faciliter l’utilisation des setters, getters par les classes héritières.
    protected final int identifiant; /*déclaration en final pour garantir que ça ne changera pas, et donc pas de setter. */
    protected String raisonSociale;
    protected String telephone;
    protected String email;
    protected Adresse adresse;
    protected String commentaire;

    // Constructeur vide
    public Societe(String raisonSociale, Adresse adresse, String telephone, String email) {
        this(0, raisonSociale, adresse, telephone, email, "");
    }

    // Constructeur avec paramètres (Surcharge)
    public Societe(int identifiant, String raisonSociale, Adresse adresse, String telephone, String email, String commentaire) {
        this.identifiant = identifiant;
        try {
            // Définition des valeurs avec les setters
            setRaisonSociale(raisonSociale);
            setTelephone(telephone);
            setEmail(email);
            setAdresse(adresse);
            setCommentaire(commentaire);
        } catch (IllegalArgumentException e) {
            // Gestion des erreurs légères (validation de données)
            System.err.println("Erreur de validation des données : " + e.getMessage());
        } catch (Exception e) {
            // Gestion de l'exception générale (non prévue)
            System.err.println("Erreur inattendue : " + e.getMessage());
        } finally {
            // Log d'information et nettoyage
            System.out.println("[LOG] Tentative de création d'une société avec l'identifiant : " + identifiant);
        }
    }

    protected Societe() {
        identifiant = 0;
    }

    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        if (adresse == null) {
            throw new IllegalArgumentException("L'adresse ne peut pas être nulle.");
        }
        this.adresse = adresse;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Veuillez entrer un email.");
        }
        if (!email.matches(String.valueOf(REGEX_EMAIL))) {
            throw new IllegalArgumentException("L'email est invalide.");
        }
        this.email = email;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        if (raisonSociale == null || raisonSociale.trim().isEmpty()) {
            throw new IllegalArgumentException("La raison sociale ne peut pas être vide.");
        }
        this.raisonSociale = raisonSociale;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        if (!telephone.matches(String.valueOf(REGEX_TELEPHONE))) {
            throw new IllegalArgumentException("Le numéro de téléphone est invalide.");
        }
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Societe{" +
                "identifiant=" + identifiant +
                ", raisonSociale='" + raisonSociale + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", adresse=" + adresse +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }

    // Méthode afficher
    public abstract void afficher();
}