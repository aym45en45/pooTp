public class Developpeur extends Employe {

    public Developpeur(String name, String prenom, int year, int nbrHeures, int nbrHeuresSupp) {
        super(name, prenom, year, nbrHeures, nbrHeuresSupp);
    }

    public int CalculPaie() {
        return super.getNbrHeures() * 500;
    }

    public int CalculHeuresSupp() {
        return super.getNbrHeuresSupp() * 700;
    }

    public int CalculPaieFinal() {
        return CalculPaie() + CalculHeuresSupp() + 2000 * (2023 - getYear());
    }

    public String toString() {
        return "Developpeur info :\n" + super.toString() + " la paie finale :" + CalculPaieFinal();
    }
}
