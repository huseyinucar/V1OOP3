package practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
        return Math.pow(0.9, (LocalDate.now().getYear() - bouwjaar)) * nieuwprijs;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Fiets) {
            Fiets andereFiets = (Fiets) obj;

            if (super.equals(andereFiets) && framenummer == ((Fiets) obj).framenummer) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
