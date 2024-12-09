package com.benja2.ProjetSociete1;

public class Adresse extends com.benja2.entites.Adresse {
    private String adresse;

    public Adresse(String numeroRue, String nomRue, String codePostal, String ville) {
        super(numeroRue, nomRue, codePostal, ville);
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;

    }
}