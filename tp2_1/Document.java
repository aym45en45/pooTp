import java.util.ArrayList;
import java.util.List;

public class Document {
    private String name;
    protected ArrayList<Personne> authors;

    public Document(String name, ArrayList<Personne> authors) {
        this.name = name;
        this.authors = authors;
    } 

    public int NbrAuteur() {
        return authors.size();
    }

    @Override
    public String toString() {
        StringBuilder authorNames = new StringBuilder();
        for (Personne author : authors) {
            authorNames.append(author.getNom()).append(" ").append(author.getPrenom()).append(", ");
        }

        return "Document: " + name + "\nAuthors: " + authorNames.toString();
        //return "Document: " + name + "\nAuthors: " + authorNames.toString().substring(0, authorNames.length() - 2);
    }
}
