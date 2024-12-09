package com.benja2.entites.Utilitaires;
import com.benja2.entites.Client;
import java.util.ArrayList;


public class ArrayListClients {
    private final ArrayList<Client> clients;

    public ArrayListClients() {
        clients = new ArrayList<>();
    }

    // Ajouter un client à la liste
    public void ajouterClient(Client client) {
        clients.add(client);
    }

    // Supprimer un client de la liste
    public void supprimerClient(Client client) {
        clients.remove(client);
    }

    // Afficher tous les clients
    public void afficherClients() {
        if (clients.isEmpty()) {
            System.out.println("Aucun client à afficher.");
        } else {
            for (Client client : clients) {
                System.out.println(client);
            }
        }
    }

    // Getter pour la liste des clients
    public ArrayList<Client> getClients() {
        return clients;
    }
}
