public class Helicoptere extends Vehicule implements Flight {
    int Heure_de_Vol;

    public Helicoptere(String brand, int date, float prix, int Heure_de_Vol) {
        super(brand, date, prix);
        this.Heure_de_Vol = Heure_de_Vol;
    }

    @Override
    public void afficher() {
        System.out.println("prix aftetr promo " + calculprix() + "\nheuresDeVol est " + Heure_de_Vol);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        else
            return false;
    }

    @Override
    public double calculprix() {
        double pri = prix - (2023 - date) * prix * 0.05;
        int co = 0;
        for (int i = 5000; i < Heure_de_Vol; i = i + 5000) {
            co++;
        }
        return pri - 0.8 * co * pri;
    }

    @Override
    public boolean CanFly() {
        if (LongDistanceFlight())
            return false;
        return true;

    }

    @Override
    public boolean LongDistanceFlight() {
        if (Heure_de_Vol > 1000)
            return false;
        return true;
    }

}
