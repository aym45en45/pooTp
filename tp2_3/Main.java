public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Porsche", 2022, 100000, 4, 600, 20000);
        Voiture voiture1 = new Voiture("Merdassa", 2015, 80000, 4, 450, 80000);
        Avion avion = new Avion("Boeing", 2020, 200000000, 7000);
        Avion avion1 = new Avion("Airbus", 2021, 180000000, 6000);
        System.err.println("---------------------");
        voiture.afficher();
        System.err.println("---------------------");
        voiture1.afficher();
        System.err.println("---------------------");
        avion.afficher();
        System.err.println("---------------------");
        avion1.afficher();
        System.err.println("---------------------");
        if (voiture.equals(avion)) {
            System.err.println("Porsche is equal to Boeing");
        } else {
            System.err.println("Porsche is not equal to Boeing");
        }

        if (voiture1.equals(avion1)) {
            System.err.println("Merdassa is equal to Airbus");
        } else {
            System.err.println("Merdassa is not equal to Airbus");
        }

        if (voiture.equals(voiture1)) {
            System.err.println("Porsche is equal to Merdassa");
        } else {
            System.err.println("Porsche is not equal to Merdassa");
        }

        if (avion.equals(avion1)) {
            System.err.println("Boeing is equal to Airbus");
        } else {
            System.err.println("Boeing is not equal to Airbus");
        }

        if (voiture.equals(voiture)) {
            System.err.println("Porsche is equal to itself");
        } else {
            System.err.println("Porsche is not equal to itself");
        }

    }
}
