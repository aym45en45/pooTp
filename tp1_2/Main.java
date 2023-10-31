import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] Tab = new Animal[2];
        for (int i = 0; i < Tab.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter details for Animal " + (i + 1));
            System.out.print("Nom: ");
            String nom = scanner.next();
            System.out.print("Race: ");
            String race = scanner.next();
            String type = null;
            while (true) {
                try {
                    System.out.print("Type (carnivore or herbivore): ");
                    type = scanner.next();
                    if ("carnivore".equalsIgnoreCase(type) || "herbivore".equalsIgnoreCase(type)) {
                        break;
                    } else {
                        throw new Exception("Invalid type. Please enter 'carnivore' or 'herbivore'.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            Tab[i] = new Animal(nom, race, type);
        }

        Animal.AnimalStatistique(Tab);
        Animal.toString(Tab);
    }
}
