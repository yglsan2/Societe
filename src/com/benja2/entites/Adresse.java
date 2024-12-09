package com.benja2.entites;

public class Adresse {
    private String numeroRue;
    private String nomRue;
    private String codePostal;
    private String ville;

    // Constructeur
    public Adresse(String numeroRue, String nomRue, String codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // Getters et Setters
    public String getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(String numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }


    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return numeroRue + " " + nomRue + ", " + codePostal + " " + ville;
    }
}
