import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personne author1 = new Personne("John", "Doe", 1980);
        Personne author2 = new Personne("Jane", "Smith", 1995);

        ArrayList<Personne> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);

        Document document = new Document("Sample Document", authors);
        System.out.println(document.toString());

        Livre book = new Livre("Sample Book", authors, "123456789", 29.99, 2020);
        System.out.println(book.toString());

        Personne buyer = new Personne("Alice", "Johnson", 2002);
        System.out.println("Selling price for " + buyer.getNom() + ": $" + book.PrixVente(buyer));
    }
}
        