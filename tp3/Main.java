import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Vecteurs[] v = new Vecteurs[10];
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            v[i] = new Vecteurs(x,y);
            System.out.println(v[i].toString());
            
        }
        
        Arrays.sort(v);
        System.out.println("\n--------------------\n");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].toString());
            
        }
    }
}
