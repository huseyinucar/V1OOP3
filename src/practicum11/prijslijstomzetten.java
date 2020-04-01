package practicum11;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class prijslijstomzetten {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);;

        System.out.print("Voer de bestandsnaam in: ");
        String filename = input.next();
        System.out.print("Voer naam van het nieuwe bestand in: ");
        String newfilename = input.next();

        try {
            File file = new File("C:\\Users\\huso_\\Desktop\\HU V1B 19-20\\V1OOP\\src\\practicum11\\"+newfilename);

            boolean fvar = file.createNewFile();
            if (fvar){
                System.out.println("Bestand succesvol aangemaakt!");
            }
            else{
                System.out.println("Bestand bestaat al!");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }

        System.out.print("Voer waarde van dollar in eurocenten : ");
        double waarde =  input.nextDouble();

        List<String> alleRegels = Files.readAllLines(Paths.get("C:\\Users\\huso_\\Desktop\\HU V1B 19-20\\V1OOP" +
                "\\src\\practicum11\\"+filename));
        String alleTekst = Files.readString(Paths.get("C:\\Users\\huso_\\Desktop\\HU V1B 19-20\\V1OOP" +
                "\\src\\practicum11\\"+filename));
        String namepass[] = alleTekst.split(":");
        String artikelnaam = namepass[0];
        //double prijs = Integer.parseInt(namepass[1]);
        //double convert = prijs * waarde;

        for (String regel : alleRegels) {
            System.out.println(regel);
        }
        //System.out.println(convert);
    }
}
