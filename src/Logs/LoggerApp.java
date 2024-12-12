package Logs;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;

public class LoggerApp {
    private static final Logger logger = Logger.getLogger(LoggerApp.class.getName());
    private static FileHandler fileHandler = null;



//utilisation de la Javadoc pour mieux comprendre le fonctionnement des logs avec le logger.
//@param permet donner des précisions sur un paramètre particulier alors que
//@throws permet de lancer automatiquement, ici l’exception.


    /**
     * Initialise le logger avec un fichier de log et un format spécifique.
     *
     * @param logFile le chemin du fichier de log
     * @param appendMode si true, les logs seront ajoutés à la fin du fichier existant
     * @throws Exception si une erreur se produit lors de l'ouverture du fichier de log
     */
    public static void initFichierLog(String logFile, boolean appendMode) throws Exception {
        try {
            // Créer un FileHandler pour écrire dans le fichier de log
            fileHandler = new FileHandler(logFile, appendMode);

            // Désactiver les handlers par défaut (console)
            logger.setUseParentHandlers(false);

            // Ajouter le FileHandler à notre logger
            logger.addHandler(fileHandler);

            // Définir le format de log, ici on utilise un format simple par défaut
            fileHandler.setFormatter(new SimpleFormatter());

            logger.info("Logger initialisé avec succès.");
        } catch (Exception e) {
            // Log léger de l'erreur, sans alourdir avec une exception sévère
            logger.log(Level.WARNING, "Une erreur est survenue lors de l'initialisation du fichier de log.", e);
            throw new Exception("Erreur lors de l'initialisation du fichier de log.", e); // Exception plus générique
        }
    }

    /**
     * Méthode pour fermer proprement les handlers de log.
     */
    public static void closeLogger() {
        if (fileHandler != null) {
            try {
                fileHandler.close();
            } catch (SecurityException e) {
                logger.log(Level.WARNING, "Erreur lors de la fermeture du fichier de log.", e);
            }
        }
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        try {
            // Initialisation avec un fichier de log nommé "application.log" en mode ajout
            initFichierLog("application.log", true);

            // Enregistrer un message de log
            logger.info("Application démarrée.");

        } catch (Exception e) {
            logger.log(Level.WARNING, "Échec de l'initialisation du logger", e);
        } finally {
            // Fermer proprement le logger à la fin de l'exécution
            closeLogger();
        }
    }

    public static void initFichierLog() {
    }
}
