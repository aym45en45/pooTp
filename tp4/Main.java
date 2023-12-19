import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Float> notes = new ArrayList<>();
        Etudiant student = new Etudiant("rouissa", "aymen", 22, notes);
        System.out.println("Enter notes of the Student 1 :");
        student.RemplirNotes(); 
        Etudiant student1 = new Etudiant("brahmia", "abdou", 20, notes);
        System.out.println("Enter notes of the Student 2 :");
        student1.RemplirNotes(); 
        Etudiant student2 = new Etudiant("belmokhi", "dibaj", 19, notes);
        System.out.println("Enter notes of the Student 3 :");
        student2.RemplirNotes(); 
        student.stocker();
        student1.stocker();
        student2.stocker();

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
