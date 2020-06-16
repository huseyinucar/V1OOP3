package practicum9A;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.euroBedrag(3.11314));
        System.out.println(Utils.euroBedrag(3.11314, 1) + "\n");

        System.out.println(Utils.euroBedrag(3.113));
        System.out.println(Utils.euroBedrag(2.98));
        System.out.println(Utils.euroBedrag(2.9857));
        System.out.println(Utils.euroBedrag(24.5872));
        System.out.println(Utils.euroBedrag(5));
        System.out.println(Utils.euroBedrag(3.11314, 2));
        System.out.println(Utils.euroBedrag(3.85374, -1));
        System.out.println(Utils.euroBedrag(3.42714, 3));
        System.out.println(Utils.euroBedrag(3.31354, 5));
        System.out.println(Utils.euroBedrag(3, 13) + "\n");
        
        System.out.print("Aantal keren euroBedrag-methoden gebruikt: ");
        System.out.print(Utils.getAantal());
    }
}