public class Chat extends Animal implements Pet{

    String couleur;

    public Chat(String nom, boolean vegetarien, String couleur) {
        super(nom, vegetarien);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "cat nom : " + nom + ", it is a carnivorous\n"+"Its couleur is :" + couleur;
    }

    @Override
    public void Diagnostique(double poids) {
        if (poids >= 8)
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
    public boolean CanBePet() {
        return true;
        
    }

    @Override
    public void LifeSpan() {
        
    }

}
