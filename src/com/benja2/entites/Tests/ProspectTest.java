package com.benja2.entites.Tests;
import com.benja2.entites.Prospect;
import com.benja2.entites.Utilitaires.ImmuInteresse;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

    public class ProspectTest {

        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        @Test
        void testConstructorValid() {
            LocalDate date = LocalDate.parse("15/08/2023", FORMATTER);
            Prospect prospect = new Prospect("123", "Rue de Paris", "75001", "Paris", "Raison Sociale",
                    "0123456789", "test@example.com", "Commentaire", date, ImmuInteresse.OUI);

            assertEquals("123", prospect.getIdentifiant());
            assertEquals("Rue de Paris", prospect.getAdresse().getNomRue());
            assertEquals("75001", prospect.getAdresse().getCodePostal());
            assertEquals("Paris", prospect.getAdresse().getVille());
            assertEquals("Raison Sociale", prospect.getRaisonSociale());
            assertEquals("0123456789", prospect.getTelephone());
            assertEquals("test@example.com", prospect.getEmail());
            assertEquals("Commentaire", prospect.getCommentaire());
            assertEquals("15/08/2023", prospect.getDateProspection().format(FORMATTER));
            assertEquals(ImmuInteresse.OUI, prospect.getInteresse());
        }

        @Test
        void testSetDateInvalid() {
            Prospect prospect = new Prospect("47", "Rue de Laxou", "54000", "Nancy", "Raison Sociale",
                    "0123456789", "test@example.com", "Commentaire",
                    LocalDate.parse("15/08/2023", FORMATTER), ImmuInteresse.OUI);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> prospect.setDateProspection(null));
            assertEquals("La date de prospection ne peut pas être nulle.", exception.getMessage());
        }

        @Test
        void testSetInteresseInvalid() {
            Prospect prospect = new Prospect("47", "Rue de Laxou", "54000", "Nancy", "Raison Sociale",
                    "0123456789", "test@example.com", "Commentaire",
                    LocalDate.parse("15/08/2023", FORMATTER), ImmuInteresse.OUI);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> prospect.setInteresse(null));
            assertEquals("L'intérêt ne peut pas être nul.", exception.getMessage());
        }

        @Test
        void testToString() {
            Prospect prospect = new Prospect("47", "Rue de Laxou", "54000", "Nancy", "Raison Sociale",
                    "0123456789", "test@example.com", "Commentaire",
                    LocalDate.parse("15/08/2023", FORMATTER), ImmuInteresse.OUI);

            String result = prospect.toString();
            assertTrue(result.contains("15/08/2023"));
            assertTrue(result.contains("OUI"));
            assertTrue(result.contains("Commentaire"));
        }
    }






