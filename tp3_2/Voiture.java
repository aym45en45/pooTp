public class Voiture extends Vehicule implements Driving {

    int NbrPortes, Puissances, Kilometrage;

    public Voiture(String brand, int date, float prix, int nbrPortes, int puissances, int kilometrage) {
        super(brand, date, prix);
        NbrPortes = nbrPortes;
        Puissances = puissances;
        Kilometrage = kilometrage;
    }

    @Override
    public double calculprix() {
        double pri = prix - (2023 - date) * prix * 0.05;
        int co = 0;
        for (int i = 100000; i < Kilometrage; i = i + 100000) {
            co++;
        }
        return pri - 0.1 * co * pri;
    }

    @Override
    public void afficher() {
        System.out.println("prix aftetr promo " + calculprix() + "\nNbrPortes est " + NbrPortes + "\nPuissances est "
                + Puissances + "\nKilometrage est " + Kilometrage);
    }

    @Override
    public boolean RoadDriving() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        else
            return false;
    }

}
