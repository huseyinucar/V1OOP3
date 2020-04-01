package practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g) {
        if (!alleGoederen.contains(g) && budget >= g.huidigeWaarde()) {
            budget -= g.huidigeWaarde();
            alleGoederen.add(g);
        }
    }

    public String toString() {
        StringBuilder goederen = new StringBuilder();
        for (Goed goed : alleGoederen) {
            goederen.append("\n").append(goed.toString());
        }

        return String.format("\n%s heeft een budget van %s en bezit de volgende goederen:%s", bedrijfsnaam,
                Utils.euroBedrag(budget),
                goederen);
    }
}
