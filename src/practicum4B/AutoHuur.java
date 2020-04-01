package practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {}

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        if (gehuurdeAuto != null && huurder != null) {
            return gehuurdeAuto.getPrijsPerDag() * aantalDagen * (1 - huurder.getKorting() / 100);
        } else {
            return 0.0;
        }
    }

    public String toString() {
        String auto = "er is geen auto bekend";
        String klant = "er is geen huurder bekend";

        if (gehuurdeAuto != null) {
            auto = "autotype: " + gehuurdeAuto;
        }

        if (huurder != null) {
            klant = "op naam van: " + getHuurder();
        }

        return auto + "\n" + klant + "\n"
                + "aantal dagen: " + getAantalDagen() + " en dat kost " + totaalPrijs();
    }
}
