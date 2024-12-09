package com.benja2.entites.Utilitaires;
import com.benja2.entites.SocieteDurand;

import java.time.LocalDate;
public class ArrayListProspects {


    public static class Prospect extends SocieteDurand {
        private LocalDate dateProspection;
        private final String interesse;

      
        public Prospect(String numeroRue, String nomRue, String codePostal, String ville, String raisonSociale,
                        String telephone, String email, String commentaires, LocalDate dateProspection, String interesse) {
            super(numeroRue, nomRue, codePostal, ville, raisonSociale, telephone, email, commentaires);

            // Vérification : est-ce que le Prospect est intéressé par l'entreprise ? Réponse :  "oui" ou "non"
            if (!"oui".equalsIgnoreCase(interesse) && !"non".equalsIgnoreCase(interesse)) {
                throw new IllegalArgumentException("L'intérêt doit être 'oui' ou 'non'.");
            }

            this.dateProspection = dateProspection;
            this.interesse = interesse;
        }

        public LocalDate getDateProspection() {
            return dateProspection;
        }

        public void setDateProspection(LocalDate dateProspection) {
            this.dateProspection = dateProspection;
        }

        public String getInteresse() {
            return interesse;
        }



        @Override
        public String toString() {
            return super.toString() + " | Date de prospection: " + dateProspection + " | Intéressé: " + interesse;
        }

        @Override
        public void afficher() {
            
        }
    }

}
