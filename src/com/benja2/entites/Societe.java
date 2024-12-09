
package com.benja2.entites;




abstract class Societe {

    //Attributs
    private static int compteurId = 1;
    private int identifiant;
    private String raisonSociale;
    private Adresse adresse; // adresse de type Adresse
    private String telephone;
    private String email;
    private String commentaires;

    // Constructeur
    public Societe(int identifiant, String raisonSociale, Adresse adresse, String telephone, String email, String commentaires) {
        this.compteurId = compteurId++; //compteur qui ajoute 1 à chaque fois
        this.identifiant = identifiant;
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.commentaires = commentaires;



        //  !! le téléphone, l'email et le code postal devront être définis par un regex, le code postal devant obligatoirement avoir 5 chiffres (CF exceptions à lever)
    }

    public Societe(String adresse, String raisonSociale, String telephone, String email, String commentaires) {
    }

    public Societe(String numeroRue, String nomRue, String codePostal, String ville, String raisonSociale, String telephone, String email, String commentaires) {
    }

    public Societe() {

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





