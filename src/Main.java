
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
        Client client = new Client(
                "Lorraine",
                "PathéLorraine",
                "0678905634",
                "java@gmail.com",
                "Aucun commentaire",
                1034,
                100 );
        client.setAdresse(adresse);

        Adresse prospectAdresse = new Adresse("32", "Rue du TrucBidule", "54000", "Nancy");

// Création de l'objet prospectAdresse, qu'on va passer plus bas, dans le constructeur.

        Prospect prospect = new Prospect(
                "Quiche Chez DuDu",
                prospectAdresse, // ici, on passe l'objet prospectAdresse créée, façon "parse' sans utiliser de parse
                "0678901234",
                "prospect@gmail.com",
                "Commentaire prospect",
                LocalDate.now(),
                ImmuInteresse.OUI );


        // Affichage des objets
        client.afficher();
        prospect.afficher();
    }
}


