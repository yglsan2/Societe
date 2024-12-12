package Utilitaires;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionClass extends Exception {
    private static final long serialVersionUID = 1L; // Pour la sérialisation
    private final int errorCode; // Code d'erreur optionnel

    /**
     * Constructeur avec un message uniquement.
     *
     * @param message Le message d'erreur.
     */
    public ExceptionClass(String message) {
        super(message);
        this.errorCode = 0; // Code par défaut
    }

    /**
     * Constructeur avec un message et un code d'erreur.
     *
     * @param message   Le message d'erreur.
     * @param errorCode Le code d'erreur.
     */
    public ExceptionClass(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * Constructeur avec un message, un code d'erreur et une cause.
     *
     * @param message   Le message d'erreur.
     * @param errorCode Le code d'erreur.
     * @param cause     L'exception qui a causé celle-ci.
     */
    public ExceptionClass(String message, int errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    /**
     * Constructeur avec une cause uniquement.
     *
     * @param cause L'exception qui a causé celle-ci.
     */
    public ExceptionClass(Throwable cause) {
        super(cause);
        this.errorCode = 0; // Code par défaut
    }

    /**
     * Retourne le code d'erreur associé.
     *
     * @return Le code d'erreur.
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Journalise l'exception dans un fichier texte.
     *
     * @param logFilePath Chemin du fichier de journalisation.
     */
    public void logException(String logFilePath) {
        try (FileWriter fw = new FileWriter(logFilePath, true); PrintWriter pw = new PrintWriter(fw)) {
            pw.println("ExceptionClass [code=" + errorCode + "]: " + getMessage());
            if (getCause() != null) {
                pw.println("Cause: " + getCause());
            }
            pw.println("Stack Trace:");
            for (StackTraceElement element : getStackTrace()) {
                pw.println("\t" + element);
            }
            pw.println("--------------------------------------------------");
        } catch (IOException e) {
            System.err.println("Erreur lors de la journalisation : " + e.getMessage());
        }
    }

    /**
     * Retourne une représentation détaillée de l'exception.
     *
     * @return La chaîne de caractère détaillée.
     */
    @Override
    public String toString() {
        return "ExceptionClass [code=" + errorCode + ", message=" + getMessage() + "]";
    }
}
