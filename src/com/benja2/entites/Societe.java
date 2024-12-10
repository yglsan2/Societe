public abstract class Societe {

    // Attributs en protected pour faciliter l’utilisation des setters, getters par les classes héritières. 
    protected final int identifiant; /*déclaration en final pour garantir que ça ne changera pas, et donc pas de setter. */
    protected String raisonSociale;
    protected String telephone;
    protected String email;
    protected Adresse adresse;
    protected String commentaire;

    // RegExs pour l’email et le téléphone
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String REGEX_TELEPHONE = "^\\+?[0-9]+$";

    // Constructeur vide
    public Societe() {
        this.identifiant = 0; // Valeur par défaut pour un identifiant non initialisé
    }

    // Constructeur avec paramètres (Surcharge)
    public Societe(int identifiant, String raisonSociale, Adresse adresse, String telephone, String email, String commentaire) {
        this.identifiant = identifiant;
        setRaisonSociale(raisonSociale);
        setTelephone(telephone);
        setEmail(email);
        setAdresse(adresse);
        setCommentaire(commentaire);
    }

    // Getters et Setters 
/* pas de setter pour l’identifiant, qui est en final, car c’est un identifiant unique, c’est pas modifiable. * /
    public int getIdentifiant() {
        return identifiant;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Veuillez entrer un email.");
        }
        if (!email.matches(REGEX_EMAIL)) {
            throw new IllegalArgumentException("L'email est invalide.");
        }
        this.email = email;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        if (raisonSociale == null || raisonSociale.trim().isEmpty()) {
            throw new IllegalArgumentException("La raison sociale ne peut pas être vide.");
        }
        this.raisonSociale = raisonSociale;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        if (!telephone.matches(REGEX_TELEPHONE)) {
            throw new IllegalArgumentException("Le numéro de téléphone est invalide.");
        }
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Societe{" +
               "identifiant=" + identifiant +
               ", raisonSociale='" + raisonSociale + '\'' +
               ", telephone='" + telephone + '\'' +
               ", email='" + email + '\'' +
               ", adresse=" + adresse +
               ", commentaire='" + commentaire + '\'' +
               '}';
    }

