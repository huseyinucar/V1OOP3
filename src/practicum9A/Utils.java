package practicum9A;

public class Utils {
    private static int aantal;

    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        aantal ++;
        if (precisie < 0) precisie = 0;
        return String.format("€%." + precisie + "f", bedrag);
    }

    public static int getAantal() {
        return aantal;
    }
}
