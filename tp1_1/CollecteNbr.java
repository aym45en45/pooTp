import java.util.Scanner;

public class CollecteNbr {
    private int number;

    public CollecteNbr(int number) {
        this.number = number;
    }

    public static void VerifyNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an pair number.");
        } else {
            System.out.println(number + " is an impair number.");
        }
    }

    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
       // System.out.print("Enter a number: ");
        //int number = lire.nextInt();
        
        CollecteNbr n1 = new CollecteNbr(1);
        CollecteNbr n2 = new CollecteNbr(6);
        CollecteNbr n3 = new CollecteNbr(2);
        CollecteNbr n4 = new CollecteNbr(3);
        
        CollecteNbr.VerifyNumber(n1.number);
        CollecteNbr.VerifyNumber(n2.number);
        CollecteNbr.VerifyNumber(n3.number);
        CollecteNbr.VerifyNumber(n4.number);

        lire.close();
    }    
}
