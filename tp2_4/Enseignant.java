import java.util.Arrays;
import java.util.Scanner;

public class Enseignant extends Personne {

    String[] module;

    public Enseignant(String nom, String prenom, int age, String[] module) {
        super(nom, prenom, age);
        this.module = module;
    }

    public void AffecterModules() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < module.length; i++) {
            module[i] = scanner.nextLine();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "module :" + Arrays.toString(module);
    }
}
