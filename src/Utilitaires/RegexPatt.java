package Utilitaires;

import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;


public class RegexPatt {


    //Pattern pour l’heure
    public static final DateTimeFormatter PATTERN_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy");



//RegEx Etat Civil

    public static final Pattern REGEX_EMAIL = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");

    public static final Pattern REGEX_CODEPOSTAL = Pattern.compile("^[0-9]{5}$");

    public static final Pattern REGEX_TELEPHONE = Pattern.compile("^[0-9]{10}$");
}


