package com.benja2.entites.Vues;
import javax.swing.*;
import java.awt.*;

import Utilitaires.ExceptionClass;
import com.benja2.entites.Client;
import com.benja2.entites.Prospect;
import com.benja2.entites.Societe;
import com.benja2.entites.Utilitaires.ImmuInteresse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



    public class Accueil extends JFrame {

        private final List<Societe> societe;

        public Accueil() {
            // Initialisation de la fenêtre
            setTitle("Page d'Accueil des Sociétés");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // Centrer la fenêtre

            // Création de societé
            societe = new ArrayList<>();
            societe.add(new Prospect("24", "Rue des Boufflers", "54000", "Nancy", "Prospect 1", "0123456789", "prospect1@example.com", "Premier contact", LocalDate.now(), ImmuInteresse.OUI));
            societe.add(new Prospect("42", "Rue de Siam", "29000", "Brest", "Prospect 2", "0987654321", "prospect2@example.com", "Deuxième contact", LocalDate.now(), ImmuInteresse.NON));

            // Panel principal
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());

            // Liste des sociétés
            DefaultListModel<String> listModel = new DefaultListModel<>();
            for (Societe societe : societe) {
                listModel.addElement(societe.getRaisonSociale());
            }

            JList<String> listSocietes = new JList<>(listModel);
            JScrollPane scrollPane = new JScrollPane(listSocietes);
            panel.add(scrollPane, BorderLayout.CENTER);

            // Bouton de détails
            JButton buttonDetails = createDetailsButton(listSocietes);

            panel.add(buttonDetails, BorderLayout.SOUTH);

            // Ajouter le panel à la fenêtre
            this.add(panel);
        }

        private JButton createDetailsButton(JList<String> listSocietes) {
            JButton buttonDetails = new JButton("Voir les détails");
            buttonDetails.addActionListener(e -> {   // utilisation de lambda pour simplification de code
                // Récupérer le prospect sélectionné
                int selectedIndex = listSocietes.getSelectedIndex();
                if (selectedIndex != -1) {
                    Societe selectedSociete = societe.get(selectedIndex);
                    // Afficher les détails dans une boîte de dialogue
                    JOptionPane.showMessageDialog(Accueil.this, selectedSociete.toString(), "Détails de " + selectedSociete.getRaisonSociale(), JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Accueil.this, "Veuillez sélectionner une société.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            });
            return buttonDetails;
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                Accueil accueil = new Accueil();
                accueil.setVisible(true);
            });
        }
    }

