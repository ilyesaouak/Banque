// Classe CompteEpargne qui hérite de Compte
class CompteEpargne extends Compte {
    private double benefice;

    // Constructeur par défaut
    public CompteEpargne(String titulaire, double solde, double benefice) {
        super(titulaire, solde);
        this.benefice = benefice;
    }

    // Constructeur avec un paramètre titulaire
    public CompteEpargne(String titulaire) {
        super(titulaire);
    }

    // Méthode pour afficher les informations du compte épargne
    @Override
    public String toString() {
        return "CompteEpargne{" + "titulaire='" + getTitulaire() + '\'' + ", solde=" + getSolde() + ", benefice=" + benefice + '}';
    }
}
