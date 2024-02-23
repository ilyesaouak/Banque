// Classe Banque
import java.util.ArrayList;
import java.util.List;

class Banque {
    private String nom;
    private List<Compte> listCompte;

    // Constructeur par défaut
    public Banque() {
        this.nom = "";
        this.listCompte = new ArrayList<>();
    }

    // Constructeur avec un paramètre nom
    public Banque(String nom) {
        this.nom = nom;
        this.listCompte = new ArrayList<>();
    }

    // Getter pour le nom de la banque
    public String getNom() {
        return nom;
    }

    // Setter pour le nom de la banque
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour ajouter un compte à la liste des comptes de la banque
    public void ajoutCompte(Compte compte) {
        listCompte.add(compte);
    }
    // Méthode pour afficher la liste des comptes dans la banque
    public void afficherListeComptes() {
        System.out.println("Liste des comptes dans la banque " + nom + ":");
        for (Compte compte : listCompte) {
            System.out.println(compte);
        }
    }

}
