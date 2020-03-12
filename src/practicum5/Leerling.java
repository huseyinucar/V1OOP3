package practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm) {
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return this.cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public String toString() {
        String s = naam + " heeft cijfer: " + cijfer;
        return s;
    }
}
