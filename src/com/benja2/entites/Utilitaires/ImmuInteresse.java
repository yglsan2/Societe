package com.benja2.entites.Utilitaires;

public enum ImmuInteresse {

    // voir pour javadoc
     /* Enumération qui permet de lister les intéressés.
     */
    public enum Interesse {
        INTERESSE("Intéressé"),
        NON_INTERESSE("Non intéressé");

        private final String label;

        // Constructeur de l'énumération
        Interesse(String label) {
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


}
