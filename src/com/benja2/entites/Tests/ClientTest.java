package com.benja2.entites.Tests;
import Utilitaires.ExceptionClass;
import com.benja2.entites.Client;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ClientTest {

    public static void main(String[] args) {

        @Nested
        class ClientTests {

            @Test
            void testConstructorValid() {
                Client client;
                try {
                    client = new Client("24", "Rue des Ramen", "54000", "Nancy", 500, 50);
                } catch (ExceptionClass e) {
                    throw new RuntimeException(e);
                }
                assertEquals(500, client.getChiffreAffaires());
                assertEquals(50, client.getNombreEmployes());
            }



            //utilisation de lambdas pour simplificaion de code

            @Test
            void testChiffreAffairesInvalid() {
                assertThrows(IllegalArgumentException.class, () -> new Client("46", "Rue de la Ville", "75001", "Paris", 150, 50));
            }

            @Test
            void testNombreEmployesInvalid() {
                assertThrows(IllegalArgumentException.class, () -> new Client("45", "Avenue de l'Opéra", "75000", "Paris", 500, 0));
            }
        }

    }
}
