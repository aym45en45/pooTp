public class Employe {
    private String name, prenom;
    private int year, NbrHeures, NbrHeuresSupp;

    public Employe(String name, String prenom, int year, int nbrHeures, int nbrHeuresSupp) {
        this.name = name;
        this.prenom = prenom;
        this.year = year;
        NbrHeures = nbrHeures;
        NbrHeuresSupp = nbrHeuresSupp;
    }

    public String toString() {
        StringBuilder EmployeInfo = new StringBuilder();
        EmployeInfo.append(" name : ").append(name).append("\n prenome : ").append(prenom).append("\n");
        //append("\n year of recruitment : ").append(year).append("\n NbrHeures : ").append(NbrHeures).append("\n NbrHeuresSupp : ").append(NbrHeuresSupp).

        return EmployeInfo.toString();
    }

    public int getNbrHeures() {
        return NbrHeures;
    }

    public int getNbrHeuresSupp() {
        return NbrHeuresSupp;
    }

    public int getYear() {
        return year;
    }
    
}