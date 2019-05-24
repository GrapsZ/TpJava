public class Professeur extends Personne {
    protected int salaire;

    public Professeur(String nom, String prenom, int salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public Professeur(Personne personne, int salaire) {
        super(personne.getNom(), personne.getPrenom());
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
