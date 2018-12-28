public class Ring {
    double x;
    double y;
    double raadius;
    String varv;


    public Ring() {
        this.x = this.y = this.raadius = 0;
        this.varv = "värvitu";
    }

    public Ring(double raadius) {
        this.x = this.y = 0;
        this.raadius = raadius;
        this.varv = "värvitu";
    }

    public Ring(double x, double y, double raadius, String varv) {
        this.x = x;
        this.y = y;
        this.raadius = raadius;
        this.varv = varv;
    }

    public double umbermoot () {
        return Math.round(Math.PI * 2 * this.raadius);
    }

    public double pindala () {
        return Math.round(Math.PI * Math.pow(this.raadius, 2));
    }

    @Override
    public String toString() {
        return "Ringi " +
                "x=" + this.x +
                ", y=" + this.y +
                ", raadius=" + this.raadius +
                ", varv='" + this.varv + '\'' +
                '}';
    }
}