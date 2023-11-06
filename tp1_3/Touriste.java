import java.util.ArrayList;

public class Touriste {
    private String nom;
    private String prenom;
    private String nationalite;
    private int age;
    ArrayList<Pays> pays = new ArrayList<Pays>();

    public Touriste(String nom, String prenom, String nationalite, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.age = age;
    }

    public void AjouterPays(String P) {
        pays.add(new Pays(P));
    }

    public void AfficherListePays() {
        System.out.println("the counter did " + nom + " " + prenom + " vist is :");
        for (int i = 0; i < pays.size(); i++)
            System.out.println((i + 1) + " " + pays.get(i).Name);
    }

    public void LaisserCommentaire(String paysNom, String comment) {
        for (Pays p : pays) {
            if (p.Name.equals(paysNom)) {
                p.Comnt = comment;
                return;
            }
        }
    }

    public void AfficherCommentaires() {
        System.out.println("the touriste comments :");
        for (Pays p : pays) {
            System.out.println(p.Name + ": " + p.Comnt);
        }
    }
}
