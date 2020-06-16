package practicum11;

public class Utils {

    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        if (precisie < 0) precisie = 0;
        return String.format("€%." + precisie + "f", bedrag);
    }
}