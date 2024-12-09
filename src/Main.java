import com.benja2.entites.Adresse;
import com.benja2.entites.Client;
import com.benja2.entites.Prospect;
import com.benja2.entites.Utilitaires.ImmuInteresse;
import java.time.LocalDate;


public class Main {


    public static void main(String[] args) {
        // Test avec des exemples de données
        Adresse adresse = new Adresse("32", "Rue  des Lilas", "54000", "Nancy");
        Client client = new Client("Lorraine Pathé", "PathéLorraine", "0678905634", "java@gmail.com", "Aucun commentaire", 10, 100);

        Prospect prospect = new Prospect("Prospect LoP", adresse, "0987654321", "prospect@hotmail.com", "RaisonSoc",
                LocalDate.of(2024, 12, 10), ImmuInteresse.INTERESSE);


        client.afficher();
        prospect.afficher();


        // System.out.println(client);
        // System.out.println(prospect);
    }



        }


