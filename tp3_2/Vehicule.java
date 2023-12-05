public abstract class Vehicule {
    protected String brand;
    protected int date;
    protected float prix;

    public Vehicule(String brand, int date, float prix) {
        this.brand = brand;
        this.date = date;
        this.prix = prix;
    }

    public abstract void afficher();
    
    @Override
    public abstract boolean equals(Object o);

    public abstract double calculprix();

}