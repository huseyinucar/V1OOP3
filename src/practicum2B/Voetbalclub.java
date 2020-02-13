package practicum2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String na) {
        naam = na;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten() {
         int totaal = (aantalGewonnen *3) + (aantalGelijk);
         return totaal;
    }

    public int aantalGespeeld() {
        int totaal = (aantalGewonnen + aantalGelijk + aantalVerloren);
        return totaal;
    }

    public String toString() {
        return naam +" "+" "+ aantalGespeeld() +" "+ aantalGewonnen +" "+ aantalGelijk +" "+ aantalVerloren
                +" "+ aantalPunten();
    }
    
}
