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
        return (aantalGewonnen *3) + (aantalGelijk);
    }

    public int aantalGespeeld() {
        return (aantalGewonnen + aantalGelijk + aantalVerloren);
    }

    public String toString() {
        String begin = "FC";

        if (naam != null && naam.length() !=0) {
            begin = naam;
        }

        return begin +" "+" "+ aantalGespeeld() +" "+ aantalGewonnen +" "+ aantalGelijk +" "+ aantalVerloren
                +" "+ aantalPunten();
    }
    
}
