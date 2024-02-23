// Classe Compte
class Compte {
    private String titulaire;
    private double solde;

    // Constructeur avec un seul paramètre titulaire
    public Compte(String titulaire) {
        this.titulaire = titulaire;
    }

    // Constructeur avec deux paramètres titulaire et solde
    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    // Getters et Setters
    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Méthode pour débiter un montant du solde
    public void debiter(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant pour effectuer cette opération !");
        }
        this.solde -= montant;
    }

    // Méthode pour créditer un montant au solde
    public void crediter(double montant) {
        this.solde += montant;
    }

    // Méthode pour afficher les informations du compte
    @Override
    public String toString() {
        return "Compte{" + "titulaire='" + titulaire + '\'' + ", solde=" + solde + '}';
    }
}
