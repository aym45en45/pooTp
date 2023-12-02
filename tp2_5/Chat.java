public class Chat extends Animal {

    String couleur;

    public Chat(String nom, boolean vegetarien, String couleur) {
        super(nom, vegetarien);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "cat " + super.toString() + " Its couleur is :" + couleur;
    }

}
