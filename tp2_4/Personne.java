public class Personne {
    String nom,prenom;
    int age;
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    @Override
    public String toString() {
        return "nom : " + nom + "\nprenom :" + prenom + "\nage :" + age+"\n";
    }
}
