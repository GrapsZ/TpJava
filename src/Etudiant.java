import java.util.ArrayList;

public class Etudiant extends Personne {
    protected ArrayList<Integer> listeNotes = new ArrayList<Integer>();

    public Etudiant(String nom, String prenom, ArrayList<Integer> listeNotes) {
        super(nom, prenom);
        this.listeNotes = listeNotes;
    }

    public Etudiant(Personne eleve) {
        super(eleve.getNom(), eleve.getPrenom());
    }

    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }

    public void setListeNotes(ArrayList<Integer> listeNotes) {
        this.listeNotes = listeNotes;
    }

    public void addNoteInArray(Integer note) {
        this.getListeNotes().add(note);
    }

    public void addNoteInArray(Integer... note) {
        System.out.println(note);
    }

    public Integer getMoyByStudent() {
        Integer total = 0;
        Integer totalNotes = 0;
        for (int i = 0; i < this.getListeNotes().size(); i++) {
            total = total + this.getListeNotes().get(i);

            totalNotes ++;
        }
        return total / totalNotes;
    }
}
