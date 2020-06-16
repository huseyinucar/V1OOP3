package practicum2b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    public void clubnaamLeegFC() {
        Voetbalclub voetbalclub = new Voetbalclub("");
        assertTrue(voetbalclub.toString().startsWith("FC"));
    }

    @Test
    public void v0Punten() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");
        voetbalclub.verwerkResultaat('v');
        assertEquals(0, voetbalclub.aantalPunten());
    }

    @Test
    public void g1Punten() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");
        voetbalclub.verwerkResultaat('g');
        assertEquals(1, voetbalclub.aantalPunten());
    }

    @Test
    public void w3Punten() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");
        voetbalclub.verwerkResultaat('w');
        assertEquals(3, voetbalclub.aantalPunten());
    }

    @Test
    public void eenkeerGespeeld() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");
        voetbalclub.verwerkResultaat('w');
        assertEquals(1, voetbalclub.aantalGespeeld());
    }

    @Test
    public void puntensaldoInvoerh() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");
        voetbalclub.verwerkResultaat('h');
        assertEquals(0, voetbalclub.aantalPunten());
    }

    @Test
    public void aantalGespeeldInvoerh() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");
        voetbalclub.verwerkResultaat('h');
        assertEquals(0, voetbalclub.aantalGespeeld());
    }

    @Test
    public void resultaatwgv3ToString() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");

        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('v');
        assertEquals("FC 3 1 1 1 4", voetbalclub.toString());
    }

    @Test
    public void resultaatwgvww5ToString() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");

        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        assertEquals("FC 5 3 1 1 10", voetbalclub.toString());
    }

    @Test
    public void resultaatClubnaamleegwgvww5ToString() {
        Voetbalclub voetbalclub = new Voetbalclub("");

        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        assertEquals("FC 5 3 1 1 10", voetbalclub.toString());
    }

    @Test
    public void resultaatClubnaamAjaxwgvww4ToString() {
        Voetbalclub voetbalclub = new Voetbalclub("Ajax");

        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('w');
        assertEquals("Ajax 4 2 1 1 7", voetbalclub.toString());
    }

    @Test
    public void resultaatClubnaamFeijenoordwgvww4ToString() {
        Voetbalclub voetbalclub = new Voetbalclub("Feijenoord");

        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('w');
        assertEquals("Feijenoord 4 2 1 1 7", voetbalclub.toString());
    }

    @Test
    public void verwerkingHerhalenPuntensaldo() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");

        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('v');

        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('g');

        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');

        assertEquals(8, voetbalclub.aantalPunten());
    }

    @Test
    public void verwerkingHerhalenAantalGespeeld() {
        Voetbalclub voetbalclub = new Voetbalclub("FC");

        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');

        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('g');

        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('v');

        assertEquals(10, voetbalclub.aantalGespeeld());
    }

}