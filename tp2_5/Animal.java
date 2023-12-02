public class Animal {

    String nom;
    boolean vegetarien;

    public Animal(String nom, boolean vegetarien) {
        this.nom = nom;
        this.vegetarien = vegetarien;
    }

    public void Diagnostique(double poids) {
        if (this instanceof Chat) {
            if (poids >= 8)
                System.out.println(nom + " is obese");
            else
                System.out.println("le poinds de '" + nom + "' est normal");
        } else if (this instanceof Elephant) {
            if (poids >= 1000)
                System.out.println(nom + "est obese");
            else
                System.out.println("le poinds de '" + nom + "' est normal");
        }
    }

    public void Diagnostique(int age) {
        if (this instanceof Chat) {
            if (age >= 10) {
                System.out.println(nom + " est vieux");
            } else
                System.out.println(nom + " n'est pas vieux");
        } else if (this instanceof Elephant) {
            if (age >= 30) {
                System.out.println(nom + " est vieux");
            } else
                System.out.println(nom + " n'est pas vieux");
        }

    }

    @Override
    public String toString() {
        if (vegetarien)
            return "nom : " + nom + ", it is a vegetarian\n";
        else
            return "nom : " + nom + ", it is a carnivorous\n";

    }
}
