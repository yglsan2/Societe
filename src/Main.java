import Utilitaires.ArrayListClients;
import Utilitaires.ArrayListProspects;
import com.benja2.entites.*;
import Logs.LoggerApp;
import com.benja2.entites.Vues.Accueil;

import java.time.LocalDate;
import java.util.logging.Level;

import static Utilitaires.ImmuInteresse.NON;
import static Utilitaires.ImmuInteresse.OUI;
import static Utilitaires.RegexPatt.PATTERN_DATE;

public class Main {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

// Initialisation de l'instance de ArrayListProspects
        ArrayListProspects arrayListProspects = new ArrayListProspects();
        ArrayListClients arrayListClients = new ArrayListClients();



        LoggerApp.initFichierLog();

        new Accueil().setVisible(true);

        logger.log(Level.INFO, "Début du programme");

        try {
            Client client1 = new Client("RBURE", "0600004994", "client1@gmail.com", "", 128934, 567);
            Client client2 = new Client("BUERE", "0794049494", "client2@hotmail.fr", "", 45693, 4574);
            Client client3= new Client("EBRUE", "0605403045", "client3@gmail.fr", "", 934, 340);

            ArrayListClients.addClient(client1);
            ArrayListClients.addClient(client2);
            ArrayListClients.addClient(client3);

            Prospect prospect1 = new Prospect("DORI", new Adresse("19", "de Laxou", "54000", "Nancy"), "0600005605", "client@gmail.fr",  "", LocalDate.parse("03/02/2024", PATTERN_DATE), OUI.name());
            Prospect prospect2 = new Prospect("ODIR", new Adresse("34", "de Laxou", "54000", "Nancy"), "0604930493", "fr", "", LocalDate.parse("06/08/2022", PATTERN_DATE), NON.name());
            Prospect prospect3 = new Prospect("ODRI", new Adresse("53", "de Laxou", "54000", "Nancy"), "0700000009", "", "", LocalDate.parse("06/03/2023", PATTERN_DATE), NON.name());
            //utilisation de OUI.name() et NON.name(), qui permet d'appeler les réponses OUI et NOM de l'enum ImmuInteresse.


            ArrayListProspects.addProspect(prospect1);
            ArrayListProspects.addProspect(prospect2);
            ArrayListProspects.addProspect(prospect3);

            arrayListProspects.afficherTousLesProspects();


        }

        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        logger.log(Level.INFO, "Fin de programme");

    }
}