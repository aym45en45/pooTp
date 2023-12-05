public class Avion extends Vehicule implements Flight {

    private int heuresDeVol;

    public Avion(String brand, int date, float prix, int heuresDeVol) {
        super(brand, date, prix);
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public double calculprix() {
        double pri = prix - (2023 - date) * prix * 0.05;
        int co = 0;
        for (int i = 5000; i < heuresDeVol; i = i + 5000) {
            co++;
        }
        return pri - 0.8 * co * pri;
    }

    @Override
    public void afficher() {
        System.out.println("prix aftetr promo " + calculprix() + "\nheuresDeVol est " + heuresDeVol);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        else
            return false;
    }

    @Override
    public boolean CanFly() {
        if (LongDistanceFlight())
            return false;
        return true;

    }

    @Override
    public boolean LongDistanceFlight() {
        if (heuresDeVol > 1000)
            return false;
        return true;
    }

}
