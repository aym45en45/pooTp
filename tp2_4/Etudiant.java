import java.util.Arrays;
import java.util.Scanner;

public class Etudiant extends Personne {

    float[] note;

    public Etudiant(String nom, String prenom, int age, float[] note) {
        super(nom, prenom, age);
        this.note = note;
    }

    public void RemplirNotes() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < note.length; i++) {
            note[i] = scanner.nextInt();
        }
    }

    public double CalculMoyenne() {
        float total = 0;
        for (int i = 0; i < note.length; i++) {
            total += note[i];
        }
        return total / note.length;
    }

    @Override
    public String toString() {
        return super.toString() + "note :" + Arrays.toString(note) + "\nLa moyenne est :" + this.CalculMoyenne();
    }
}
