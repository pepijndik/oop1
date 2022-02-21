package nl.hva.student;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Student en klas generator
 *
 * @author pepijn dik
 */
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Geef een klas naam:");
        Klas k1 = new Klas(input.nextLine());

        System.out.println("Wie zitten er in deze klas?");
        int studentNr = 0;
        do {
            System.out.println("Student: "+k1.aantalStudenten);
            System.out.print("Wat is het student nummer?");
            studentNr = input.nextInt();
            input.nextLine();

            if (!validateExit(studentNr, k1)) {
                break; //Breek de do while loop .... lelijk
            }

            System.out.print("Student voornaam");
            String voornaam = input.nextLine();

            System.out.println("Student achternaam");
            String achternaam = input.nextLine();


            System.out.print("Student geboorteDatum (yyyy-mm-dd)");
            String stringGeboorteDatum = input.nextLine();
            LocalDate date = LocalDate.parse(stringGeboorteDatum);


            System.out.print("Student straatnaam:");
            String straat = input.nextLine();


            System.out.print("Student huisnummer:");
            int huisNr = input.nextInt();
            String postcode = "";
            //blijven vragen om postcode totdat hij juist is
            do{
                System.out.print("Student postcode:");
                postcode = input.nextLine();
            }
            while(!Adres.checkPostcode(postcode));
            System.out.println("\n");


            System.out.print("Student plaatsnaam:");
            String plaats = input.nextLine();
            System.out.println("\n");

            Adres adres = new Adres(straat,huisNr,postcode,plaats);

            Student student = new Student(studentNr, voornaam, achternaam,date,adres);

            if(k1.voegStudentToe(student)){
                System.out.println("Student " + student.voornaam +" Succesvol toegevoegd aan: " + k1.naam);
            }
        } while (validateExit(studentNr, k1));

        if(k1.aantalStudenten >= 1){
            System.out.println(k1.toString());
        }
    }

    /**
     * Valideer of maximaal is berijkt of studentNr is nul
     *
     * @param studentNr
     * @param klas
     * @return
     */
    public static boolean validateExit(int studentNr, Klas klas) {
        if (studentNr != 0 && klas.getAantalStudenten() != klas.MAX_AANTAL_STUDENTEN) {
            return true;
        }
        return false;
    }
}
