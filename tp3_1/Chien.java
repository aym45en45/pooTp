public class Chien extends Animal implements Pet{

    public Chien(String nom, boolean vegetarien) {
        super(nom, vegetarien);
    }

    @Override
    public void Diagnostique(double poids) {
        if (poids >= 20)
            System.out.println(nom + " is obese");
        else
            System.out.println("le poinds de '" + nom + "' est normal");
    }

    @Override
    public void Diagnostique(int age) {
        if (age >= 10) {
            System.out.println(nom + " est vieux");
        } else
            System.out.println(nom + " n'est pas vieux");
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean CanBePet() {
        return true;
    }

    @Override
    public void LifeSpan() {
        
    }
    
}
