import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final int N = 100;
    private static final String[] NAMES = {
            "Muhammad", "Aisha", "Ahmed", "Fatima", "Omar", "Leila", "Hasan", "Layla", "Ali", "Mariam"
    };
    private static final String[] PRENOMS = {
            "Abbas", "Kadhim", "Najjar", "Jawad", "Sabbagh", "Fahmy", "Saad", "Salim", "Sharif", "Rizk"
    };

    public static void main(String[] args) {
        Personne[] personne = new Personne[N];
        Random random = new Random();

        for (int i = 0; i < personne.length; i++) {

            int randomIndex = random.nextInt(NAMES.length);
            String name = NAMES[randomIndex];
            int randomIndexx = random.nextInt(NAMES.length);
            String prenom = PRENOMS[randomIndexx];
            int year = random.nextInt(2004 - 1923 + 1) + 1923;

            personne[i] = new Personne(name, prenom, year);
        }

        int numberOfAuther = random.nextInt(N) + 1;
        System.out.println("the numberOfAuther is " + numberOfAuther + "\n");
        ArrayList<Integer> authorIndex = new ArrayList<>();

        ArrayList<Document> documents = new ArrayList<>();
        do {
            ArrayList<Personne> authors = new ArrayList<>();
            for (int i = 0; i < 5 && numberOfAuther != 0; i++) {
                int randomIndex;
                do {
                    randomIndex = random.nextInt(personne.length);
                } while (authorIndex.contains(randomIndex));
                authorIndex.add(randomIndex);

                authors.add(personne[randomIndex]);
                numberOfAuther--;
            }
            Document document = new Document("Document " + documents.size(), authors);
            documents.add(document);
        } while (numberOfAuther != 0);

        for (Document doc : documents) {
            System.out.println("the number of the Auteur in " + doc.getName() + " is " + doc.NbrAuteur());
            System.out.println(doc.toString());
        }
    }
}
