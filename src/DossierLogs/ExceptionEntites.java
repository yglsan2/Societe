package DossierLogs;

/**
 * Exception personnalisée pour la gestion des erreurs liées aux entités.
 */
public class ExceptionEntites extends Exception {

    /**
     * Constructeur par défaut.
     */
    public ExceptionEntites() {
        super("Une erreur liée aux entités est survenue.");
    }

    /**
     * Constructeur avec message personnalisé.
     *
     * @param message le message détaillant l'erreur
     */
    public ExceptionEntites(String message) {
        super(message);
    }

    /**
     * Constructeur avec message et cause.
     *
     * @param message le message détaillant l'erreur
     * @param cause   la cause initiale de l'exception
     */
    public ExceptionEntites(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructeur avec cause uniquement.
     *
     * @param cause la cause initiale de l'exception
     */
    public ExceptionEntites(Throwable cause) {
        super("Une erreur liée package entités est survenue.", cause);
    }
}
