

import java.util.ArrayList;
import java.util.Scanner;

public class Enseignant extends Personne implements Comparable<Enseignant>{

    private ArrayList<String>  module;
    private static ArrayList<Enseignant>  SEnseignant;
    private String nom;
    

    public Enseignant(String nom, String prenom, int age, ArrayList<String>  module) {
        super(nom, prenom, age);
        this.module = module;
        this.nom=nom;
    }

    public void AffecterModules() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            module.add(scanner.nextLine());
        }
    }

    
    @Override
    public void stocker() {
        SEnseignant.add(this);
    }

    @Override
    public int compareTo(Enseignant o) {
        if (this.nom.charAt(0) > o.nom.charAt(0))
            return 1;
        else if (this.nom.charAt(0)  < o.nom.charAt(0) )
            return -1;
        else
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + "module :" + module.toString();
    }
    public static ArrayList<Enseignant> getSEnseignant() {
        return SEnseignant;
    }
}
