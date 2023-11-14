
public class Livre extends Document {
    private String ISBN;
    private double price;
    private int year;

    public Livre( String ISBN, double price, int year) {
        this.ISBN = ISBN;
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
                // If the Personne is the author, the book is free for them
                return 0;
            }
        }

        // If the Personne is under 20, apply a 20% discount
        if (p.getYear() > (year + 20)) {
            return price * 0.8;
        }

        return price;
    }

}
