public class Avion extends Vehicule {

    private int heuresDeVol;

    public Avion(String brand, int date, float prix, int heuresDeVol) {
        super(brand, date, prix);
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public double calculprix() {
        int co =0;
        for(int i =5000;i<heuresDeVol;i=i+5000){
            co++;
        }
        return super.calculprix()-0.8*co*super.calculprix();
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("prix aftetr promo "+calculprix()+"\nheuresDeVol est " + heuresDeVol);
    }

}
