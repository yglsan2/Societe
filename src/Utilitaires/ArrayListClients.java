package Utilitaires;

 import com.benja2.entites.Client;

 import java.util.ArrayList;

 /**
  * Classe représentant une liste de clients.
  */
 public class ArrayListClients {
     private static ArrayList<Client> clients = new ArrayList<>();

     /**
      * Constructeur par défaut.
      */
     public ArrayListClients() {
         clients = new ArrayList<>();
     }

     /**
      * Ajouter un client à la liste.
      *
      * @param client Le client à ajouter.
      */
     public static void addClient(Client client) {
         if (client != null) {
             clients.add(client);

         }

         else {
             System.out.println("Erreur : Le client ne peut pas être null.");
         }
     }

     /**
      * Supprimer un client de la liste.
      *
      * @param client Le client à supprimer.
      */
     public void supprimerClient(Client client) {
         if (client != null) {
             clients.remove(client);
         }
         else {
             System.out.println("Erreur : Le client ne peut pas être null.");
         }
     }

     /**
      * Afficher tous les clients.
      */
     public void afficherClients() {
         if (clients.isEmpty()) {
             System.out.println("Aucun client à afficher.");
         }

         else {
             for (Client client : clients) {
                 System.out.println(client.toString());
             }
         }
     }

     /**
      * Getter pour la liste des clients.
      *
      * @return La liste des clients.
      */
     public ArrayList<Client> getClients() {
         return new ArrayList<>(clients); // Retourne une copie de la liste pour éviter les modifications externes.
     }
 }