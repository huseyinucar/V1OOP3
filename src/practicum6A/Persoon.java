package practicum6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<>();

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (!mijnGames.contains(g) && budget >= g.huidigeWaarde()) {
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        } else {
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (mijnGames.contains(g) && koper.koop(g)) {
            mijnGames.remove(g);
            budget += g.huidigeWaarde();
            return true;
        } else {
            return false;
        }
    }

    public Game zoekGameOpNaam(String nm) {
        for (Game game : mijnGames) {
            if (game.getNaam().equals(nm)) {
                return game;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder games = new StringBuilder();
        for (Game game : mijnGames) {
            games.append("\n").append(game.toString());
        }
        return String.format("%s heeft een budget van €%.2f en bezit de volgende games:%s", naam, getBudget(), games);
    }
}