package com.benja2.entites;


public class Client extends Societe {
    private final long chiffreAffaires;
    private final int nombreEmployes;

    public Client(String adresse, String raisonSociale, String telephone, String email, String commentaires, long chiffreAffaires, int nombreEmployes) {
             /*super(adresse, raisonSociale, telephone, email, commentaires);*/
             super();

             System.out.println("Adresse : " + adresse);



             // À faire :
        // les logs
        //  les exceptions
        //  les tests unitaires

                  if (chiffreAffaires <= 200) {
            throw new IllegalArgumentException("Le chiffre d'affaires doit être supérieur à 200.");
        }
                  if (nombreEmployes <= 0) {
            throw new IllegalArgumentException("Le nombre d'employés doit être supérieur à zéro.");
        }
        this.chiffreAffaires = chiffreAffaires;
        this.nombreEmployes = nombreEmployes;
    }




    // Getters
    public long getChiffreAffaires() {
        return chiffreAffaires;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chiffre d'Affaires: " + chiffreAffaires + ", Nombre d'Employés: " + nombreEmployes;
    }


    protected void setAdresse(String adresse) {

    }

    @Override
    public void afficher() {
        System.out.println(this.toString());
        System.out.println("Identifiant : " + getIdentifiant());
        System.out.println("Raison Sociale : " + getRaisonSociale());
        System.out.println("Adresse : " + getAdresse());
        System.out.println("Téléphone : " + getTelephone());
        System.out.println("Email : " + getEmail());
        System.out.println("Commentaires : " + getCommentaires());
    }
}



// 2 pb