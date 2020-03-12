package practicum4B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur ah1;

    @BeforeEach
    public void init() {
          ah1 = new AutoHuur();
    }

    @Test
    public void geenHuurderWelAuto0Dagen() {
        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(0);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\ner is geen huurder bekend\n" +
                "aantal dagen: 0 en dat kost 0.0", ah1.toString());
    }

    @Test
    public void geenHuurderWelAuto1Dag() {
        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(1);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\ner is geen huurder bekend\n" +
                "aantal dagen: 1 en dat kost 0.0", ah1.toString());
    }

    @Test
    public void geenHuurderWelAuto2Dag() {
        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(2);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\ner is geen huurder bekend\n" +
                "aantal dagen: 2 en dat kost 0.0", ah1.toString());
    }

    @Test
    public void geenHuurderWelAuto3Dag() {
        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(3);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\ner is geen huurder bekend\n" +
                "aantal dagen: 3 en dat kost 0.0", ah1.toString());
    }

    @Test
    public void welHuurderWelAuto5DagenKorting() {
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(5);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" +
                "op naam van: Mijnheer de Vries (korting: 10.0%)\n" +
                "aantal dagen: 5 en dat kost 225.0", ah1.toString());
    }

    @Test
    public void welHuurderWelAuto3DagenKorting() {
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(3);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" +
                "op naam van: Mijnheer de Vries (korting: 10.0%)\n" +
                "aantal dagen: 3 en dat kost 135.0", ah1.toString());
    }

    @Test
    public void welHuurderWelAuto2DagenKorting5prt() {
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(5.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(2);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" +
                "op naam van: Mijnheer de Vries (korting: 5.0%)\n" +
                "aantal dagen: 2 en dat kost 95.0", ah1.toString());
    }

    @Test
    public void welHuurderWelAuto7DagenKorting5prt() {
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(5.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(7);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" +
                "op naam van: Mijnheer de Vries (korting: 5.0%)\n" +
                "aantal dagen: 7 en dat kost 332.5", ah1.toString());
    }

    @Test
    public void welHuurderWelAuto3Dagen() {
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(3);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" +
                "op naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                "aantal dagen: 3 en dat kost 150.0", ah1.toString());
    }

    @Test
    public void welHuurderWelAuto6Dagen() {
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(6);
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" +
                "op naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                "aantal dagen: 6 en dat kost 300.0", ah1.toString());
    }
}