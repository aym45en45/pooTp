public class Voiture extends Vehicule {

    int NbrPortes, Puissances, Kilometrage;

    public Voiture(String brand, int date, float prix, int nbrPortes, int puissances, int kilometrage) {
        super(brand, date, prix);
        NbrPortes = nbrPortes;
        Puissances = puissances;
        Kilometrage = kilometrage;
    }

    @Override
    public double calculprix() {
        int co = 0;
        for (int i = 100000; i < Kilometrage; i = i + 100000) {
            co++;
        }
        return super.calculprix() - 0.1 * co * super.calculprix();
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("prix aftetr promo "+calculprix()+"\nNbrPortes est " + NbrPortes + "\nPuissances est " + Puissances + "\nKilometrage est " + Kilometrage);
    }

}
