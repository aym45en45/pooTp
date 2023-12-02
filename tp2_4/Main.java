public class Main {
    public static void main(String[] args) {
        float[] notes = new float[5];
        Etudiant student = new Etudiant("rouissa", "aymen", 20, notes);
        System.out.println("Enter notes of the Student :");
        student.RemplirNotes();
        System.out.println(student.toString());

        String[] modules = new String[4];
        Enseignant ens = new Enseignant("rsa", "rabah", 28, modules);
        System.out.println("Enter modules of the teacher :");
        ens.AffecterModules();
        System.out.println(ens.toString());

        Personne prs = new Personne("mouhamed", "soualme", 50);
        prs = ens; // no error here car we make cast-up
        // ens = prs; we have an error here car Enseignant is Perssone subClass so we need to make cast-down first
        student = (Etudiant) prs; // no error herre car we make cast-down

    }
}
