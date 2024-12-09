import com.benja2.entites.Adresse;
import com.benja2.entites.Client;

public class Main {
    public static void main(String[] args) {

                Adresse adresse = new Adresse("123", "Rue des Lilas", "54000", "Nancy");
                Client client = new Client(adresse, "Société ABC", "0123456789", "abc@exemple.com",
                        "Client fidèle", 500000, 50);

                client.afficher();
            }





        }


