public class Personne {
    private String nom;
    private String prenom;
    private int year;

    public Personne(String nom, String prenom, int year) {
        this.nom = nom;
        this.prenom = prenom;
        this.year = year;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getYear() {
        return year;
    }

}