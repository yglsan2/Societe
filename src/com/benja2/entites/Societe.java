
package com.benja2.entites;

public abstract class Societe {

    // Attributs en protected pour faciliter l’utilisation des setters, getters par les classes héritières.
    protected final int identifiant; /*déclaration en final pour garantir que ça ne changera pas, et donc pas de setter. */
    protected String raisonSociale;
    protected String telephone;
    protected String email;
    protected Adresse adresse;
    protected String commentaire;

    // RegExs pour l’email et le téléphone
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String REGEX_TELEPHONE = "^\\+?[0-9]+$";

    // Constructeur vide
    public Societe(String raisonSociale, Adresse adresse, String telephone, String email) {
        this.identifiant = 0; // Valeur par défaut pour un identifiant non initialisé
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

    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        try {
            if (adresse == null) {
                throw new IllegalArgumentException("L'adresse ne peut pas être nulle.");
            }
            this.adresse = adresse;
        } catch (IllegalArgumentException e) {
            // Erreur légère si l'adresse est nulle
            System.err.println("Erreur adresse : " + e.getMessage());
        } finally {
            // Log d'information
            System.out.println("[LOG] Adresse modifiée.");
        }
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        try {
            this.commentaire = commentaire;
        } catch (Exception e) {
            // Erreur légère sur la modification du commentaire
            System.err.println("Erreur commentaire : " + e.getMessage());
        } finally {
            // Log d'information
            System.out.println("[LOG] Commentaire modifié.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            if (email == null || email.isEmpty()) {
                throw new IllegalArgumentException("Veuillez entrer un email.");
            }
            if (!email.matches(REGEX_EMAIL)) {
                throw new IllegalArgumentException("L'email est invalide.");
            }
            this.email = email;
        } catch (IllegalArgumentException e) {
            // Erreur légère pour email invalide ou vide
            System.err.println("Erreur email : " + e.getMessage());
        } finally {
            // Log d'information
            System.out.println("[LOG] Email modifié.");
        }
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        try {
            if (raisonSociale == null || raisonSociale.trim().isEmpty()) {
                throw new IllegalArgumentException("La raison sociale ne peut pas être vide.");
            }
            this.raisonSociale = raisonSociale;
        } catch (IllegalArgumentException e) {
            // Erreur légère pour raison sociale vide
            System.err.println("Erreur raison sociale : " + e.getMessage());
        } finally {
            // Log d'information
            System.out.println("[LOG] Raison sociale modifiée.");
        }
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        try {
            if (!telephone.matches(REGEX_TELEPHONE)) {
                throw new IllegalArgumentException("Le numéro de téléphone est invalide.");
            }
            this.telephone = telephone;
        } catch (IllegalArgumentException e) {
            // Erreur légère pour téléphone invalide
            System.err.println("Erreur téléphone : " + e.getMessage());
        } finally {
            // Log d'information
            System.out.println("[LOG] Téléphone modifié.");
        }
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
