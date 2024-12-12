package com.benja2.entites;

import Utilitaires.ExceptionClass;

import static Utilitaires.RegexPatt.REGEX_CODEPOSTAL;
import java.util.logging.Level;
import java.util.logging.Logger;

//javadoc
/**
 * Classe représentant une adresse.
 * Cette classe contient des informations sur le numéro de rue, le nom de rue,
 * le code postal et la ville. Elle inclut également des méthodes pour valider
 * les champs et pour gérer les exceptions possibles liées à ces validations.
 */
public class Adresse {

    private static final Logger logger = Logger.getLogger(Adresse.class.getName());
    private String numeroRue;
    private String nomRue;
    private String codePostal;
    private String ville;

    /**
     * Constructeur par défaut de la classe Adresse.
     */
    public Adresse() {}

    /**
     * Constructeur avec paramètres pour initialiser une adresse.
     *
     * @param numeroRue le numéro de la rue
     * @param nomRue le nom de la rue
     * @param codePostal le code postal
     * @param ville le nom de la ville
     */
    public Adresse(String numeroRue, String nomRue, String codePostal, String ville) {

            setNumeroRue(numeroRue);
            setNomRue(nomRue);
            setCodePostal(codePostal);
            setVille(ville);

    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        try {
            if (codePostal == null || codePostal.trim().isEmpty()) {
                throw new ExceptionClass("Entrer le code postal");
            }
            if (!REGEX_CODEPOSTAL.matcher(codePostal).matches()) {
                throw new ExceptionClass("Le code postal n'est pas valide");
            }
            this.codePostal = codePostal;
        } catch (ExceptionClass e) {
            logger.log(Level.WARNING, "Problème avec le code postal", e);
        } catch (IllegalArgumentException e) {
            logger.log(Level.INFO, "Argument invalide pour le code postal", e);
        } catch (NullPointerException e) {
            logger.log(Level.INFO, "Valeur nulle pour le code postal", e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erreur inconnue lors de la validation du code postal", e);
        } finally {
            logger.log(Level.INFO, "Fin de la validation du code postal");
        }
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        try {
            if (nomRue == null || nomRue.trim().isEmpty()) {
                throw new ExceptionClass("Veuillez entrer le nom de la rue");
            }
            this.nomRue = nomRue;
        } catch (ExceptionClass e) {
            logger.log(Level.WARNING, "Problème avec le nom de la rue", e);
        } catch (IllegalArgumentException e) {
            logger.log(Level.INFO, "Argument invalide pour le nom de la rue", e);
        } catch (NullPointerException e) {
            logger.log(Level.INFO, "Valeur nulle pour le nom de la rue", e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erreur inconnue lors de la validation du nom de la rue", e);
        } finally {
            logger.log(Level.INFO, "Fin de la validation du nom de la rue");
        }
    }

    public String getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(String numeroRue) {
        try {
            if (numeroRue == null || numeroRue.trim().isEmpty()) {
                throw new ExceptionClass("Veuillez entrer le numéro de la rue");
            }
            this.numeroRue = numeroRue;
        } catch (ExceptionClass e) {
            logger.log(Level.WARNING, "Problème avec le numéro de la rue", e);
        } catch (IllegalArgumentException e) {
            logger.log(Level.INFO, "Argument invalide pour le numéro de la rue", e);
        } catch (NullPointerException e) {
            logger.log(Level.INFO, "Valeur nulle pour le numéro de la rue", e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erreur inconnue lors de la validation du numéro de la rue", e);
        } finally {
            logger.log(Level.INFO, "Fin de la validation du numéro de la rue");
        }
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        try {
            if (ville == null || ville.trim().isEmpty()) {
                throw new ExceptionClass("Veuillez entrer la ville");
            }
            this.ville = ville;
        } catch (ExceptionClass e) {
            logger.log(Level.WARNING, "Problème avec le nom de la ville", e);
        } catch (IllegalArgumentException e) {
            logger.log(Level.INFO, "Argument invalide pour la ville", e);
        } catch (NullPointerException e) {
            logger.log(Level.INFO, "Valeur nulle pour la ville", e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erreur inconnue lors de la validation de la ville", e);
        } finally {
            logger.log(Level.INFO, "Fin de la validation de la ville");
        }
    }

    /**
     * Retourne une représentation sous forme de chaîne de l'adresse.
     *
     * @return une chaîne contenant l'adresse complète
     */
    @Override
    public String toString() {
        return "Adresse{" +
                "codePostal='" + codePostal + '\'' +
                ", numeroRue='" + numeroRue + '\'' +
                ", nomRue='" + nomRue + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
