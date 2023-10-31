import java.util.Scanner;

public class Animal {
    private String nom;
    private String race;
    private String type;
    private static int carnivore = 0;
    private static int herbivore = 0;

    public Animal(String nom, String race, String type) {
        this.nom = nom;
        this.race = race;
        this.type = type;
    }

    public static void AnimalStatistique(Animal tab[]) {
        
        for (int i =0;i<tab.length;i++) {
            if (tab[i].getType().equalsIgnoreCase("carnivore")) {
                Animal.carnivore++;
            } else if (tab[i].getType().equalsIgnoreCase("herbivore")) {
                Animal.herbivore++;
            }
        }
        System.out.println("Nombre de carnivore : " + Animal.carnivore);
        System.out.println("Nombre d'herbivore : " + Animal.herbivore);
        
    }
    
    public static void toString(Animal tab[]) {
        for(int i =0;i<tab.length;i++){
            System.out.println("name of this animal "+(i+1)+" is : " + tab[i].nom);
            System.out.println("race of this animal "+(i+1)+" is : " + tab[i].race);
            System.out.println("type of this animal "+(i+1)+" is : " + tab[i].type);
        }
    }
    
    public String getType() {
        return type;
    }
}
