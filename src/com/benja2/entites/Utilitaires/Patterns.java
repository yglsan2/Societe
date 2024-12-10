package com.benja2.entites.Utilitaires;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static javax.print.attribute.Size2DSyntax.MM;
import static org.junit.jupiter.api.Assertions.*;

class PatternsTest {

    public class Patterns {
        // RegEx pour les emails
        public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        // RegEx pour la date au format jj/MM/aaaa
        public static final String DATE_PATTERN = "dd/MM/yyyy";
    }
}