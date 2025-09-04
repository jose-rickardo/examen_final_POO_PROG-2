import java.time.LocalDateTime;

public class Etudiant {
    int id ;
    String nom;
    String prenom;
    String adresse;
    String email;
    LocalDateTime dateDeInscription;
    Groupe groupe;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDateDeInscription() {
        return dateDeInscription;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public Etudiant(int id, String nom, String prenom, String adresse, String email, Groupe groupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.groupe = groupe;
    }
}
