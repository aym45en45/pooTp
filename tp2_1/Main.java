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
        Random random = new Random();
        Personne[] personne = new Personne[N];

        for (int i = 0; i < personne.length; i++) {

            int randomIndex = random.nextInt(NAMES.length);
            int randomIndexx = random.nextInt(NAMES.length);
            personne[i] = new Personne(NAMES[randomIndex], PRENOMS[randomIndexx], (random.nextInt(82) + 1923));
        }

        int numberOfAuther = random.nextInt(5) + 1;
        System.out.println("the numberOfAuther is " + numberOfAuther + "\n");
        ArrayList<Integer> authorIndex = new ArrayList<>();
        for (int i = 0; i < numberOfAuther; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(personne.length);
            } while (authorIndex.contains(randomIndex));
            authorIndex.add(randomIndex);
        }

        Document[] documents = new Document[3];
        for (int i = 0; i < documents.length; i++) {
            ArrayList<Personne> authors = new ArrayList<>();
            int numberOfAutherInDoc = random.nextInt(numberOfAuther) + 1;
            for (int j = 0; j < numberOfAutherInDoc; j++) {
                authors.add(personne[authorIndex.get(j)]);
            }
            documents[i] = new Document("Document " + (i+1), authors);
        }

        Livre livre = new Livre(documents[0].getName(), documents[0].authors, "132548", 17.99, 2010);
        Livre livre1 = new Livre(documents[1].getName(), documents[1].authors, "156432", 17.99, 2019);
        Livre livre2 = new Livre(documents[2].getName(), documents[2].authors, "789453", 17.99, 2006);
        // random buyer
        System.out.println(livre.toString());
        System.out.println(livre.PrixVente(personne[random.nextInt(N)]));
        // buyer that is 12 years old 
        System.out.println(livre1.toString());
        Personne p = new Personne("aymen", "rouissa", 2011);
        System.out.println(livre1.PrixVente(p));
        // buyer in an author
        System.out.println(livre2.toString());
        System.out.println(livre2.PrixVente(personne[authorIndex.get(0)]));
    }
}
