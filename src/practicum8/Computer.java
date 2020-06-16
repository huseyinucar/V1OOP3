package practicum8;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    public double huidigeWaarde() {
        return Math.pow(0.6, (LocalDate.now().getYear() - productieJaar)) * aanschafPrijs;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Computer) {
            Computer andereComputer = (Computer) obj;

            if (this.type.equals(andereComputer.type) && macAdres.equals(((Computer) obj).macAdres)) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString() {
        return String.format("Computer: %s heeft een waarde: %s", type, Utils.euroBedrag(huidigeWaarde()));
    }
}