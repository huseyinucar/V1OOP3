package practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Voertuig) {
            Voertuig andereVoertuig = (Voertuig) obj;

            if (this.type.equals(andereVoertuig.type) && bouwjaar == ((Voertuig) obj).bouwjaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString() {
        return String.format("Voertuig: %s met bouwjaar %s heeft een waarde van: %s", type, bouwjaar,
                Utils.euroBedrag(nieuwprijs));
    }
}
