package com.benja2.entites.Utilitaires;

public enum ImmuInteresse {

    // voir pour javadoc
    /* Enumération qui permet de lister les intéressés.
     */

        INTERESSE(),
        NON_INTERESSE();

        private String label;

        // Constructeur de l'énumération
        void Interesse(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        @Override
        public String toString() {
            return label;
        }
    }




