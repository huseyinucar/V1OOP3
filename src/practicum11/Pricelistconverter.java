package practicum11;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Pricelistconverter {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Voer de bestandsnaam in: ");
            String filename = input.next();

            File file = new File("C:\\Users\\huso_\\Desktop\\HU V1B 19-20\\V1OOP\\src\\" +
                    "practicum11\\" + filename);

            System.out.print("Voer naam voor het nieuwe bestand in: ");
            String newfilename = input.next();

            System.out.print("Voer waarde van dollar in eurocenten : ");
            double waarde = input.nextDouble();
            System.out.println();

            FileInputStream fis = new FileInputStream(file);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            FileWriter fstream = new FileWriter("C:\\Users\\huso_\\Desktop\\HU V1B 19-20\\V1OOP\\src\\" +
                    "practicum11\\" + newfilename, true);

            BufferedWriter out = new BufferedWriter(fstream);

            String str;
            while ((str = in.readLine()) != null) {
                String[] tokens = str.split(":");
                String artikelnaam = tokens[0];
                double prijs = Double.parseDouble(tokens[1]);
                double result = waarde * prijs;
                out.write(artikelnaam + "" + ":" + " " + Utils.euroBedrag(result));
                out.newLine();
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.print("Het ingevoerde bestandsnaam is niet gevonden! Probeer het opnieuw");
        } catch (IOException e) {
            System.out.print("Het ingevoerde bestands is al aangemaakt! Probeer het opnieuw");
        } catch (InputMismatchException e) {
            System.out.print("Het ingevoerde waarde is geen getal! Voer een getal in");
        }
    }
}