public class Vehicule {
    private String brand;
    private int date;
    private float prix;

    public Vehicule(String brand, int date, float prix) {
        this.brand = brand;
        this.date = date;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("the brande " + brand + "\ndate est " + date + "\nprix est " + prix);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        else
            return false;
    }

    public double calculprix() {
        return prix - (2023 - date) * prix * 0.05;
    }

    public String getBrand() {
        return brand;
    }

    public int getDate() {
        return date;
    }

    public float getPrix() {
        return prix;
    }

}