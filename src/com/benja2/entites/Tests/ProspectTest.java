

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
        assertEquals("15/08/2023", prospect.getDateProspection().format(FORMATTER));
        assertEquals(ImmuInteresse.OUI, prospect.getInteresse());
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            LocalDate.parse("2023-08-15", FORMATTER); // Simule une erreur de format
        });
    }

    @Test
    void testSetDateInvalid() {
        Prospect prospect = new Prospect("47", "Rue de Laxou", "54000", "Nancy", "Raison Sociale",
                "0123456789", "test@example.com", "Commentaire",
                LocalDate.parse("15/08/2023", FORMATTER), ImmuInteresse.OUI);
        assertThrows(IllegalArgumentException.class, () -> prospect.setDateProspection(null));
    }

    @Test
    void testToString() {
        Prospect prospect = new Prospect("47", "Rue de Laxou", "54000", "Nancy", "Raison Sociale",
                "0123456789", "test@example.com", "Commentaire",
                LocalDate.parse("15/08/2023", FORMATTER), ImmuInteresse.OUI);
        assertTrue(prospect.toString().contains("15/08/2023"));
        assertTrue(prospect.toString().contains("OUI"));
    }

    // Méthode utilitaire privée
    private void validerPasNul(Object value, String message) {
        if (value == null) {
            throw new IllegalArgumentException(message);
        }
    }
}
