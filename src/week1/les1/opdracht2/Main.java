package week1.les1.opdracht2;

public class Main {
    public static void main(String[] args) {

        Klant k1 = new Klant("Jan", "Nijenoord 1", "Utrecht");
        System.out.println(k1.getNaam());
        System.out.println(k1.getAdres());
        System.out.println(k1.getPlaats());
        System.out.println(k1.toString());

        Klant k2 = new Klant("Wim", "Oudenoord 340", "Utrecht");
        System.out.println("Naam: " + k2.getNaam());
        System.out.println("Adres: " + k2.getAdres());
        System.out.println("Woonplaats: " + k2.getPlaats());
        System.out.println("klant nr 2: " + k2.toString());
    }
}