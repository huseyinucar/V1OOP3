package practicum5;

import java.util.ArrayList;
import java.util.TreeMap;

public class Klas {
    private String klasCode;
    private TreeMap<String, Leerling> deLeerlingen = new TreeMap<>();

    public Klas(String kC) {
        klasCode = kC;
    }

    public void voegLeerlingToe(Leerling I) {
        deLeerlingen.put(I.getNaam(), I);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        if (deLeerlingen.containsKey(nm)) {
            deLeerlingen.get(nm).setCijfer(nweCijfer);
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return new ArrayList<>(deLeerlingen.values());
    }

    public int aantalLeerlingen() {
        return deLeerlingen.size();
    }

    public String toString() {
        StringBuilder leerlingen = new StringBuilder();
        for (Leerling I : deLeerlingen.values()) {
            leerlingen.append(I.toString()).append('\n');
        }

        return "In klas " + klasCode + " zitten de volgende leerlingen:" + '\n' + leerlingen;
    }
}
