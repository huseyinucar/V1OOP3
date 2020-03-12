package practicum6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rjr, double nwpr) {
        naam = nm;
        releaseJaar = rjr;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        return Math.pow(0.7, (LocalDate.now().getYear() - releaseJaar)) * nieuwprijs;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) && releaseJaar == ((Game) andereObject).releaseJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString() {
        String s =  String.format("%s, uitgegeven in %d; nieuwprijs: €%.2f nu voor: €%.2f", getNaam(), releaseJaar,
                nieuwprijs, huidigeWaarde());
        return s;
    }
}
