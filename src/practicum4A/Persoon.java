package practicum4A;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        naam = nm;
        leeftijd = lft;
    }

    public String toString() {
        return "en heeft huisbaas " + naam + "; " + "leeftijd " + leeftijd +
                " jaar";
    }
}