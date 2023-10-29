import java.util.ArrayList;

public class Touriste {
    private String nom;
    private String prenom;
    private String nationalité;
    ArrayList<String> pays = new ArrayList<String>();
    private String Commentaire;


    public Touriste(String nom, String prenom, String nationalité) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalité = nationalité;
    }
    public void AjouterPays(String P){
        pays.add(P);
    }
    public void AfficherListePays (){
        System.out.println("the counter did this touriste vist is :");
        for(int i=0;i<pays.size();i++)
            System.out.println(pays.get(i));
    }
    public void LaisserCommentaire(String C){
        this.Commentaire=C;
    }
    public void AfficherCommentaires(){
        
    }
}
