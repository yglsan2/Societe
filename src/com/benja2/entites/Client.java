package com.benja2.entites;


import Utilitaires.ExceptionClass;

import java.util.logging.Logger;


/**

 * Représente un client avec des informations

 * sur son chiffre d'affaires et son nombre d'employés.

 * Extends la classe Société.

 */

public class Client extends Societe {

    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());

    private static int compteur = 1; // Compteur commence à 1

    private long chiffreAffaires;

    private int nombreEmployes;


    /**

     * Constructeur par défaut pour la classe Client.

     */

    public Client() {

        // Constructeur vide

    }


    /**
     * Constructeur avec tous les paramètres requis pour créer un Client.
     *
     * @param raisonSociale   La raison sociale du client.
     * @param telephone       Le numéro de téléphone du client.
     * @param email           L'email du client.
     * @param commentaire     Commentaires supplémentaires.
     * @param chiffreAffaires Le chiffre d'affaires du client.
     * @param nombreEmployes  Le nombre d'employés dans la société.
     * @throws Utilitaires.ExceptionClass Si les valeurs du chiffre d'affaires ou du nombre d'employés sont invalides.
     */

    public Client(String raisonSociale, String telephone, String email, String commentaire, long chiffreAffaires, int nombreEmployes) throws ExceptionClass {

        super(generateIdentite(), raisonSociale, adresse, telephone, email, commentaire);

        try {

            setChiffreAffaires(chiffreAffaires); // On peut directement appeler la méthode ici

            setNombreEmployes(nombreEmployes); // On peut directement appeler la méthode ici

        } catch (ExceptionClass e) {

            LOGGER.info("Erreur lors de la création d'un client : " + e.getMessage());

            throw e;

        } catch (Exception e) {

            LOGGER.info("Erreur inattendue lors de la création d'un client : " + e.getMessage());

            throw new ExceptionClass("Erreur inattendue lors de la création d'un client");

        } finally {

            // Nettoyage et initialisation

            LOGGER.info("Nettoyage et initialisation après la création d'un client");

        }

    }


    /**

     * Génère une nouvelle identité unique pour chaque client.

     *

     * @return La nouvelle identité générée.

     */

    private static int generateIdentite() {

        return compteur++;

    }


    /**

     * Obtient le chiffre d'affaires du client.

     *

     * @return Le chiffre d'affaires.

     */

    public long getChiffreAffaires() {

        return chiffreAffaires;

    }


    /**

     * Définit le chiffre d'affaires du client.

     *

     * @param chiffreAffaires Le chiffre d'affaires à définir (doit être supérieur à 200).

     * @throws Utilitaires.ExceptionClass Si la valeur est inférieure ou égale à 200.

     */

    public void setChiffreAffaires(long chiffreAffaires) throws ExceptionClass {

        if (chiffreAffaires <= 200) {

            throw new ExceptionClass("Le chiffre d'affaires doit être strictement supérieur à 200.");

        }

        this.chiffreAffaires = chiffreAffaires;

    }


    /**

     * Obtient le nombre d'employés du client.

     *

     * @return Le nombre d'employés.

     */

    public int getNombreEmployes() {

        return nombreEmployes;

    }


    /**

     * Définit le nombre d'employés du client.

     *

     * @param nombreEmployes Le nombre d'employés à définir (doit être positif).

     * @throws ExceptionClass Si la valeur est inférieure ou égale à 0.

     */

    public void setNombreEmployes(int nombreEmployes) throws ExceptionClass {

        if (nombreEmployes <= 0) {

            throw new ExceptionClass("Le nombre d'employés doit être strictement positif.");

        }

        this.nombreEmployes = nombreEmployes;

    }


    /**

     * Représente l'objet Client sous forme de chaîne de caractères.

     *

     * @return Une représentation textuelle de l'objet Client.

     */

    @Override

    public String toString() {

        return super.toString() + "Client{" +

                "chiffreAffaires=" + chiffreAffaires +

                ", nombreEmployes=" + nombreEmployes +

                '}';
    }

    @Override
    public void afficher() {
        System.out.println("Informations du client :");
        System.out.println("Raison sociale : " + getRaisonSociale());
        System.out.println("Adresse : " + getAdresse());
        System.out.println("Téléphone : " + getTelephone());
        System.out.println("Email : " + getEmail());
        System.out.println("Commentaire : " + getCommentaire());
        System.out.println("Chiffre d'affaires : " + getChiffreAffaires());
        System.out.println("Nombre d'employés : " + getNombreEmployes());
    }
}