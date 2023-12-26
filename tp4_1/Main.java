
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Etudiant student = new Etudiant("rouissa", "aymen", 22);
        student.stocker();
        Etudiant student1 = new Etudiant("brahmia", "abdou", 20);
        student1.stocker();
        Etudiant student2 = new Etudiant("belmokhi", "dibaj", 19);
        student2.stocker();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter ls note of the student "+(i+1)+" :");
            Etudiant.getSEtudiant().get(i).RemplirNotes();
        }

        Collections.sort(Etudiant.getSEtudiant());
        for (int i = 0; i < 3; i++) {
            System.out.println(Etudiant.getSEtudiant().get(i).toString());
        }
        
        ArrayList<String> modules = new ArrayList<>();
        Enseignant ens = new Enseignant("mouatsi", "moudjib", 20, modules);
        ens.stocker();
        Enseignant ens1 = new Enseignant("rsa", "rabah", 28, modules);
        ens1.stocker();
        Enseignant ens2 = new Enseignant("aymen", "rabah", 28, modules);
        ens2.stocker();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter modules of the teacher"+(i+1)+" :");
            Enseignant.getSEnseignant().get(i).AffecterModules();
        }
        Collections.sort(Enseignant.getSEnseignant());
        for (int i = 0; i < 3; i++) {
            System.out.println(Enseignant.getSEnseignant().get(i).toString());
        }
    }
}
