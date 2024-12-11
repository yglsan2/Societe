package com.benja2.entites.Tests;
import com.benja2.entites.Client;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;






public class ClientTest {

    public static void main(String[] args) {

        @Nested
        class clientTest {

            @Test
            void testConstructorValid() {
                Client client = new Client("24", "Rue des Ramen", "54000", "Nancy", 500, 50);
                assertEquals(500, client.getChiffreAffaires());
                assertEquals(50, client.getNombreEmployes());
            }

            @Test
            void testChiffreAffairesInvalid() {
                assertThrows(IllegalArgumentException.class, () -> {
                    new Client("46", "Rue de la Ville", "75001", "Paris", 150, 50);
                });
            }

            @Test
            void testNombreEmployesInvalid() {
                assertThrows(IllegalArgumentException.class, () -> {
                    new Client("45", "Avenue de l'Opéra", "75000", "Paris", 500, 0);
                });
            }
        }

    }
}
