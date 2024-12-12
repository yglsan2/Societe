package Utilitaires;

import com.benja2.entites.Prospect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProspects {
    private final List<Prospect> prospects;

    public ArrayListProspects() {
        this.prospects = new ArrayList<>();
    }

    public static void addProspect(Prospect prospect1) {
    }

    public void ajouterProspect(Prospect prospect) {
        prospects.add(prospect);
    }

    public void supprimerProspect(Prospect prospect) {
        prospects.remove(prospect);
    }

    public List<Prospect> getProspects() {
        return new ArrayList<>(prospects);
    }

    public void afficherTousLesProspects() {
        for (Prospect prospect : prospects) {
            prospect.afficher();
        }
    }
}

