import java.util.Scanner;

public class Animal {
    private String nom;
    private String race;
    private String type;
    private int carnivore;
    private int herbivore;

    public Animal(String nom, String race, String type) {
        this.nom = nom;
        this.race = race;
        this.type = type;
    }

    
    public static void main(String[] args) {
        Animal[] Tab = new Animal[2];
        for (int i = 0; i < 2; i++) {
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

        AnimalStatistique(Tab);
        toString(Tab);
    }

    public static void AnimalStatistique(Animal tab[]) {
        int carnivoreCount = 0;
        int herbivoreCount = 0;
        
        for (int i =0;i<2;i++) {
            if (tab[i].getType().equalsIgnoreCase("carnivore")) {
                carnivoreCount++;
            } else if (tab[i].getType().equalsIgnoreCase("herbivore")) {
                herbivoreCount++;
            }
        }
        tab[0].carnivore = carnivoreCount;
        tab[0].herbivore = herbivoreCount;

    }
    
    public static void toString(Animal tab[]) {
        System.out.println("Nombre de carnivore : " + tab[0].carnivore);
        System.out.println("Nombre d'herbivore : " + tab[0].herbivore);
    }
    
    public String getType() {
        return type;
    }
}
