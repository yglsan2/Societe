package DossierLogs;
import java.io.IOException;
import java.util.logging.*;

public class LoggerManager {

    // Logger (variable de classe)
    public static final Logger LOGGER = Logger.getLogger(LoggerManager.class.getName());

    // Méthode du LOGGER
    public static void setupLogger() {
        try {
            // FileHandler (avec nom de fichier et mode append)
            FileHandler fh = new FileHandler("LogAppli.log", true);

            // Suppression de gestionnaires par défaut (pas de log dans la console)
            LOGGER.setUseParentHandlers(false);

            // Ajout du gestionnaire de fichiers au Logger
            LOGGER.addHandler(fh);

            // Le formatter à afficher dans le gestionnaire de fichier
            fh.setFormatter(new FormatterLogs());

        } catch (IOException e) {
            // Niveau ajusté à WARNING
            LOGGER.log(Level.WARNING, "Erreur d'initialisation du logger : une exception non critique est survenue.", e);
        }
    }

    public static void main(String[] args) {
        // Configuration du logger
        setupLogger();
    }
}

        /*Exemples de logs
        LOGGER.info("Information log."); // ça renvoie : logApp.log(INFO, Application lancée)

        LOGGER.warning("Warning log."); // ça renvoie : logApp.log(WARNING, Connexion réseau instable)

        LOGGER.severe("Severe log."); // ça renvoie : LogApp.log(SEVERE, Erreur critique détectée)
        */


