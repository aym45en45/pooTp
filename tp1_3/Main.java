import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "aymen";
        String prenom = "rouissa";
        String nationalite = "alg";
        int age = 22;

        Touriste touriste = new Touriste(name, prenom, nationalite, 22);

        System.out.print("how many country this touriste visit : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("enter country " + (i + 1) + " name : ");
            String pays = scanner.next();
            touriste.AjouterPays(pays);
        }
        touriste.AfficherListePays();
        
        System.out.print("how many country that u want to leave comment for : ");
        n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("enter country name that u want to leave coment for it : ");
            String pays = scanner.nextLine();
            System.out.print("enter your coment for " + pays + " : ");
            String comment = scanner.nextLine();
            touriste.LaisserCommentaire(pays, comment);
        }
        touriste.AfficherCommentaires();

    }
}
