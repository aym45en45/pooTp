


import java.util.ArrayList;
import java.util.Scanner;

public class Etudiant extends Personne implements Comparable<Etudiant>{

    private ArrayList<Float> note;
    private static ArrayList<Etudiant> SEtudiant=new ArrayList<>();
    
    private int age;
    
    public Etudiant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.note =new ArrayList<>();
        this.age=age;
    }

    public void RemplirNotes() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            this.note.add(scanner.nextFloat());
        }
    }

    public double CalculMoyenne() {
        float total = 0;
        for (int i = 0; i < 5; i++) {
            total += note.get(i);
        }
        return total / 5;
    }

    @Override
    public void stocker() {
        SEtudiant.add(this);
    }

    @Override
    public int compareTo(Etudiant o) {
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "note :" + note.toString() + "\nLa moyenne est :" + this.CalculMoyenne();
    }

    public static ArrayList<Etudiant> getSEtudiant() {
        return SEtudiant;
    }
}
