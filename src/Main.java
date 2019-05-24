import java.util.ArrayList;

public class Main {

    protected Personne personneUne = new Personne("Michel", "Kevin");
    protected Personne personneDeux = new Personne("Rolland", "John");
    protected Personne personneTrois = new Personne("Robert", "Mike");
    protected Personne personneQuatre = new Personne("Gerard", "Alice");

    protected Professeur monProf = new Professeur(personneUne, 2500);
    protected Etudiant premierEtudiant = new Etudiant(personneDeux);
    protected Etudiant deuxiemeEtudiant = new Etudiant(personneTrois);
    protected Etudiant troisiemeEtudiant = new Etudiant(personneQuatre);

    protected ArrayList<Etudiant> tabEtudiant = new ArrayList<Etudiant>();

    protected Matiere maMatiere;


    public Main() {
        // Ajout des notes pour mes eleves
        premierEtudiant.addNoteInArray(10);
        premierEtudiant.addNoteInArray(13);
        premierEtudiant.addNoteInArray(14);

        deuxiemeEtudiant.addNoteInArray(19);
        deuxiemeEtudiant.addNoteInArray(20);
        deuxiemeEtudiant.addNoteInArray(18);

        troisiemeEtudiant.addNoteInArray(7);
        troisiemeEtudiant.addNoteInArray(10);
        troisiemeEtudiant.addNoteInArray(9);

        // Set le tableau pour chaque éleve
        premierEtudiant.setListeNotes(premierEtudiant.getListeNotes());
        deuxiemeEtudiant.setListeNotes(deuxiemeEtudiant.getListeNotes());
        troisiemeEtudiant.setListeNotes(troisiemeEtudiant.getListeNotes());

        // ajout de l'objet etudiant dans mon tableau de Main
        this.addInTabEtudiant(premierEtudiant);
        this.addInTabEtudiant(deuxiemeEtudiant);
        this.addInTabEtudiant(troisiemeEtudiant);

        maMatiere = new Matiere(monProf, getTabEtudiant());

        System.out.println("La moyenne de la classe est de : " + maMatiere.getGeneraleMoy());

        System.out.println("La moyenne de " + premierEtudiant.getPrenom()  + " est de : " + premierEtudiant.getMoyByStudent());
        System.out.println("La moyenne de " + deuxiemeEtudiant.getPrenom()  + " est de : " + deuxiemeEtudiant.getMoyByStudent());
        System.out.println("La moyenne de " + troisiemeEtudiant.getPrenom()  + " est de : " + troisiemeEtudiant.getMoyByStudent());
    }

    public ArrayList<Etudiant> getTabEtudiant() {
        return tabEtudiant;
    }

    public void addInTabEtudiant(Etudiant etudiant) {
        getTabEtudiant().add(etudiant);
    }

    public static void main(String[] args) {
        new Main();
        System.out.println("Programme exécuté avec succès.");
    }
}
