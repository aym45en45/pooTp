import java.util.Scanner;

public class CollecteNbr {
    private int number;

    public CollecteNbr(int number) {
        this.number = number;
    }

    public void VerifyNumber() {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = lire.nextInt();
        
        CollecteNbr collecteNbr = new CollecteNbr(number);
        collecteNbr.VerifyNumber();

        lire.close();
    }
    
}
