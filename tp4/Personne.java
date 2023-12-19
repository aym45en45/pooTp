public abstract class Personne {
    private String nom, prenom;
    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public abstract void stocker();

    @Override
    public String toString() {
        return "nom : " + nom + "\nprenom :" + prenom + "\nage :" + age + "\n";
    }
}
