package week1.les1.opdracht2;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;

    public Klant(String nm, String adr, String pl) {
        naam = nm;
        adres = adr;
        plaats = pl;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public String toString() {
        String s = naam + " woont op " + adres + " in " + plaats;
        return s;
    }
    }