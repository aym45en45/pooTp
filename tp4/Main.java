import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Float> notes = new ArrayList<>();
        Etudiant student = new Etudiant("rouissa", "aymen", 22, notes);
        student.stocker();
        Etudiant student1 = new Etudiant("brahmia", "abdou", 20, notes);
        student1.stocker();
        Etudiant student2 = new Etudiant("belmokhi", "dibaj", 19, notes);
        student2.stocker();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter notes of the Student "+(i+1)+" :");
            student2.getSEtudiant().get(i).RemplirNotes();            
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(student.getSEtudiant().get(i).toString());
        }
        
        ArrayList<String> modules = new ArrayList<>();
        Enseignant ens = new Enseignant("rsa", "rabah", 28, modules);
        Enseignant ens1 = new Enseignant("rsa", "rabah", 28, modules);
        Enseignant ens2 = new Enseignant("rsa", "rabah", 28, modules);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter modules of the teacher"+(i+1)+" :");
            ens.getSEnseignant().get(i).RemplirNotes();            
            ens.AffecterModules();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(student.getSEtudiant().get(i).toString());
        }
        System.out.println(ens.toString());
    }
}
