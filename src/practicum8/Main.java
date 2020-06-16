package practicum8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int ditJaar = LocalDate.now().getYear();
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
        int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden
        int releaseJaar10 = LocalDate.now().getYear() - 10; // 10 jaar geleden

        BedrijfsInventaris inventaris = new BedrijfsInventaris("Hogeschool Utrecht", 300000.00);
        BedrijfsInventaris inventaris2 = new BedrijfsInventaris("Hogeschool Amsterdam", 3000.00);

        Computer comp1 = new Computer("Apple Imac pro", "1A-2B-3C-4D-5E-6F", 4999.99, releaseJaar2);
        Computer comp2 = new Computer("Apple Imac pro", "1A-2B-3C-4D-5E-6F", 4999.99, releaseJaar2);
        Fiets fiets1 = new Fiets("Tour Populair", 486.50, releaseJaar10, 259174);
        Fiets fiets2 = new Fiets("Tour Populair", 486.50, releaseJaar10, 259174);
        Auto auto1 = new Auto("Mercedes-Benz A-klasse A 180", 9995.00, releaseJaar1, "AA-123-B");
        Auto auto2 = new Auto("Mercedes-Benz A-klasse A 180", 9995.00, releaseJaar1, "AA-123-B");

        Computer comp3 = new Computer("Apple Imac", "3B-1C-2G-6H-7N-4Y", 2599.99, ditJaar);
        Fiets fiets3 = new Fiets("Orange C8 HMB Connect", 2486.50, releaseJaar2, 595684);
        Auto auto3 = new Auto("Tesla Model 3", 40995.00, releaseJaar10, "CC-567-T");

        // Inventaris Hogeschool Utrecht
        inventaris.schafAan(comp1); inventaris.schafAan(comp2); inventaris.schafAan(comp3);
        inventaris.schafAan(fiets1); inventaris.schafAan(fiets2); inventaris.schafAan(fiets3);
        inventaris.schafAan(auto1); inventaris.schafAan(auto2); inventaris.schafAan(auto3);

        // Inventaris Hogeschool Amsterdam
        inventaris2.schafAan(comp1); inventaris2.schafAan(comp2); inventaris2.schafAan(comp3);
        inventaris2.schafAan(fiets1); inventaris2.schafAan(fiets2); inventaris2.schafAan(fiets3);
        inventaris2.schafAan(auto1); inventaris2.schafAan(auto2); inventaris2.schafAan(auto3);

        System.out.println(inventaris);
        System.out.println(inventaris2);
    }
}