package com.benja2.ProjetSociete1;

public abstract class SocieteDurand {

    //Attributs
    private int identifiant;
    private String raisonSociale;
    private Adresse adresse; // adresse de type Adresse
    private String telephone;
    private String email;
    private String commentaires;

    // Constructeur
    public SocieteDurand(int identifiant, String raisonSociale, Adresse adresse, String telephone, String email, String commentaires) {
        this.identifiant = identifiant;
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.commentaires = commentaires;
    }


    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
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
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    // Méthode abstraite
    public abstract void afficher();
}





