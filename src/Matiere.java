import java.util.ArrayList;

public class Matiere {
    protected Professeur prof;
    protected ArrayList<Etudiant> listEtudiant;

    public Matiere(Professeur prof, ArrayList<Etudiant> listEtudiant) {
        this.prof = prof;
        this.listEtudiant = listEtudiant;
    }

    public Professeur getProf() {
        return prof;
    }

    public void setProf(Professeur prof) {
        this.prof = prof;
    }

    public ArrayList<Etudiant> getListEtudiant() {
        return listEtudiant;
    }

    public void setListEtudiant(ArrayList<Etudiant> listEtudiant) {
        this.listEtudiant = listEtudiant;
    }

    public Integer getGeneraleMoy() {
        Integer total = 0;
        Integer totalNotes = 0;
        for (Etudiant student : this.listEtudiant) {
            for (Integer note : student.getListeNotes()) {
                total = total + note;

                totalNotes ++;
            }
        }

        return total / totalNotes;
    }

    @Override
    public String toString() {
        return super.toString() + "!!!!!!!";
    }
}
