package practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd) {
        if (prPd > 0.0)
            prijsPerDag = prPd;
        type = tp;
    }

    public void setPrijsPerDag(double prPd) {
        prijsPerDag = Math.max(prPd, 0.0);
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString() {
        String s = type + " met prijs per dag: " + prijsPerDag;
        return s;
    }
}
