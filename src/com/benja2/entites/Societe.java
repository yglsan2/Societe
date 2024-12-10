
package com.benja2.entites;

public abstract class Societe {

    // Attributs
    private static int compteurId = 1;
    private final int identifiant;
    private String raisonSociale;
    private Adresse adresse;
    private String telephone;
    private String email;
    private String commentaires;

    // Constructeur par défaut
    public Societe() {
        this.identifiant = compteurId++;
        this.raisonSociale = "Raison sociale non définie";
        this.adresse = null; // Une adresse par défaut pourrait aussi être ajoutée
        this.telephone = "Non défini";
        this.email = "Non défini";
        this.commentaires = "";
    }

    // Constructeur avec paramètres
    public Societe(String raisonSociale, Adresse adresse, String telephone, String email, String commentaires) {
        this.identifiant = compteurId++;
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        setTelephone(telephone);
        setEmail(email);
        this.commentaires = commentaires;
    }

    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = (raisonSociale == null || raisonSociale.isEmpty())
                ? "Raison sociale non définie"
                : raisonSociale;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        if (telephone == null || !telephone.matches("^((\\+33|0033|0)(6|7)[0-9]{8})$")) {
            this.telephone = "Non défini";
        } else {
            this.telephone = telephone;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            this.email = "Non défini";
        } else {
            this.email = email;
        }
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = (commentaires == null || commentaires.isEmpty())
                ? "Aucun commentaire"
                : commentaires;
    }

    // Méthode abstraite pour affichage
    public abstract void afficher();
}
