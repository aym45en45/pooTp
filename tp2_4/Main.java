public class Main {
    public static void main(String[] args) {
        float [] notes = new float[5];
        Etudiant student = new Etudiant("rouissa", "rabah", 20,notes );
        
         System.out.println("Enter notes of the Student :");
        student.RemplirNotes();
        System.out.println(student.toString());
        System.out.println(student.CalculMoyenne());

        String [] modules = new String[4];
        Enseignant ens = new Enseignant("rsa", "rabah", 28, modules);

        System.out.println("Enter modules of the teacher :");
        ens.AffecterModules();
        System.out.println(ens.toString());
        
    }
}
