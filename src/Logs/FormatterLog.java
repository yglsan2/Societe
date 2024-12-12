
package Logs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class FormatterLog extends Formatter {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


// utilisation de la Javadoc pour en apprendre plus sur comment fonctionnent les logs.
// @param décrit un paramètre et
// @return ce que ça retourne en résultat.

    /**
     * Formate le message de log selon un format personnalisé.
     *
     * @param record Le LogRecord contenant les informations du log.
     * @return Le message formaté en chaîne de caractères.
     */
    @Override
    public String format(LogRecord record) {
        StringBuilder formattedMessage = new StringBuilder();

        // Format de la date
        formattedMessage.append(getFormattedDate(new Date()));

        // Niveau de log
        formattedMessage.append(" Level: ").append(record.getLevel());

        // Message de log
        formattedMessage.append(" / Message: ").append(record.getMessage());

        // Nom de la classe d'origine
        formattedMessage.append(" / Classe: ").append(record.getSourceClassName());

        // Nom de la méthode d'origine
        formattedMessage.append(" / Méthode: ").append(record.getSourceMethodName());

        // Ajout d'une nouvelle ligne à la fin
        formattedMessage.append("\n");

        return formattedMessage.toString();
    }

    /**
     * Formate la date selon le format "dd/MM/yyyy HH:mm:ss".
     *
     * @param date La date à formater.
     * @return La date formatée sous forme de chaîne de caractères.
     */
    private String getFormattedDate(Date date) {
        return DATE_FORMAT.format(date);
    }
}