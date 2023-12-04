public class Elephant extends Animal {

    public Elephant(String nom, boolean vegetarien) {
        super(nom, vegetarien);
    }

    @Override
    public String toString() {
        return "Elephant nom : " + nom + ", it is a vegetarian\n";
    }

    @Override
    public void Diagnostique(double poids) {
        if (poids >= 1000)
                System.out.println(nom + "est obese");
            else
                System.out.println("le poinds de '" + nom + "' est normal");
    }

    @Override
    public void Diagnostique(int age) {
        if (age >= 30) {
            System.out.println(nom + " est vieux");
        } else
            System.out.println(nom + " n'est pas vieux");
    }
}
