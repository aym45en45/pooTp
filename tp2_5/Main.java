public class Main {
    public static void main(String[] args) {

        Chat cat = new Chat("Tom", false, "Black");
        System.out.println(cat.toString());

        Elephant elephant = new Elephant("Ele", true);
        System.out.println(elephant.toString());

        cat.Diagnostique(8.5); // call Diagnostique(double poids)
        cat.Diagnostique(11); // call Diagnostique(int age)

        elephant.Diagnostique(9.0); // call Diagnostique(double poids)
        elephant.Diagnostique(20); // call Diagnostique(int age)

        Animal animal = new Chat("Tommy", false, "black");
        animal.Diagnostique(7);
    }
}
