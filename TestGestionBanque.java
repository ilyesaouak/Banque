public class TestGestionBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte("Mouhammed", 1000);
        System.out.println(compte1);

        CompteEpargne compteEpargne1 = new CompteEpargne("Mouhammed");
        System.out.println(compteEpargne1);

        Banque banque = new Banque("BIAT");
        banque.ajoutCompte(compte1);
        banque.ajoutCompte(compteEpargne1);
        banque.afficherListeComptes();
    }
}
