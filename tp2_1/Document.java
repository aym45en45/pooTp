import java.util.ArrayList;

public class Document {
    private String name;
    protected ArrayList<Personne> authors;

    public Document(String name, ArrayList<Personne> authors) {
        this.name = name;
        this.authors = authors;
    }

    public Document() {
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

        return "Document: " + name + "\nAuthors: " + authorNames.toString() +"\n";
    } 

    public String getName() {
        return name;
    }
}
