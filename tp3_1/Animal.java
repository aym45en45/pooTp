public abstract class Animal {

    String nom;
    boolean vegetarien;

    public Animal(String nom, boolean vegetarien) {
        this.nom = nom;
        this.vegetarien = vegetarien;
    }

    public abstract void Diagnostique(double poids) ;

    public abstract void Diagnostique(int age) ;

    @Override
    public abstract String toString() ;
}
