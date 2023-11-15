import java.util.ArrayList;

public class Livre extends Document {
    private String ISBN;
    private double price;
    private int year;

    

    public Livre(String name, ArrayList<Personne> authors, String iSBN, double price, int year) {
        super(name, authors);
        ISBN = iSBN;
        this.price = price;
        this.year = year;
    }
    @Override
    public String toString() {
        return "\nISBN: " + ISBN + "\nYear: " + year;
    }
    public double PrixVente(Personne p){
        for (Personne author : super.authors) {
            if (author.equals(p)) {
                return 0;
            }
        }
        if (p.getYear() > (year + 20)) {
            return price * 0.8;
        }
        return price;
    }
}
