import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final int N = 100;
    private static final int ND = 3;
    private static final String[] NAMES = {
            "Muhammad", "Aisha", "Ahmed", "Fatima", "Omar", "Leila", "Hasan", "Layla", "Ali", "Mariam"
    };
    private static final String[] PRENOMS = {
            "Abbas", "Kadhim", "Najjar", "Jawad", "Sabbagh", "Fahmy", "Saad", "Salim", "Sharif", "Rizk"
    };

    public static void main(String[] args) {
        Random random = new Random();
        Personne[] personne = new Personne[N];

        for (int i = 0; i < personne.length; i++) {

            int randomIndex = random.nextInt(NAMES.length);
            String name = NAMES[randomIndex];
            int randomIndexx = random.nextInt(NAMES.length);
            String prenom = PRENOMS[randomIndexx];
            int year = random.nextInt(82) + 1923;
            personne[i] = new Personne(name, prenom, year);
        }

        int numberOfAuther = random.nextInt(4) + 1;
        System.out.println("the numberOfAuther is " + numberOfAuther + "\n");
        ArrayList<Integer> authorIndex = new ArrayList<>();
        for (int i = 0; i < numberOfAuther; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(personne.length);
            } while (authorIndex.contains(randomIndex));
            authorIndex.add(randomIndex);
        }

        Document[] documents = new Document[ND];
        for (int i = 0; i < documents.length; i++) {
            ArrayList<Personne> authors = new ArrayList<>();
            int numberOfAutherInDoc = random.nextInt(numberOfAuther-1) + 1;
            for (int j = 0; j < numberOfAutherInDoc; j++) {
                authors.add(personne[authorIndex.get(j)]);
            }
            documents[i] = new Document("Document " + i, authors);
        }

        for (Document doc : documents) {
            System.out.println("the number of the Auteur in is " + doc.NbrAuteur());
            System.out.println(doc.toString());
        }
        
    }
}
