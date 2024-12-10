



import com.benja2.entites.Adresse;
import com.benja2.entites.Client;
import com.benja2.entites.Prospect;
import com.benja2.entites.Utilitaires.ImmuInteresse;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Création d'une adresse
        Adresse adresse = new Adresse("32", "Rue des Lilas", "54000", "Nancy");

        // Création d'un client
        String clientNom = "Lorraine";
        String clientRaisonSociale = "PathéLorraine";
        String clientTelephone = "0678905634";
        String clientEmail = "java@gmail.com";
        String clientCommentaire = "Aucun commentaire";
        int clientChiffreAffaires = 1034;
        int clientNombreEmployes = 100;

        Client client = new Client(
                clientNom,
                clientRaisonSociale,
                clientTelephone,
                clientEmail,
                clientCommentaire,
                clientChiffreAffaires,
                clientNombreEmployes
        );
        client.setAdresse(adresse);

        // Création d'une adresse Prospect
        Adresse prospectAdresse = new Adresse("56", "Rue du TrucBidule", "54000", "Nancy");

        // Création des variables pour le prospect
        String prospectRaisonSociale = "Quiche Chez DuDu";
        String prospectTelephone = "0678905644";
        String prospectEmail = "prospect@gmail.com";
        String prospectCommentaire = "Commentaire prospect";

        // Création de l'objet Prospect
        Prospect prospect = new Prospect(
                prospectRaisonSociale,
                prospectAdresse,
                prospectTelephone,
                prospectEmail,
                prospectCommentaire,

                LocalDate.now(),
                ImmuInteresse.OUI
        );

        // Affichage des objets
        client.afficher();
        prospect.afficher();
    }
}





















