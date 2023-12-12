public class Vecteurs implements Comparable<Vecteurs> {
    double x, y;

    public Vecteurs(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Vecteurs o) {
        if (this.norm() > o.norm())
            return 1;
        else if (this.norm() < o.norm())
            return -1;
        else
            return 0;
    }

    public double norm() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "Vecteurs [x=" + x + ", y=" + y + ", norm = " +norm()+"]";
    }
    

}