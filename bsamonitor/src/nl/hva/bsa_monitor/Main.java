package nl.hva.bsa_monitor;

import java.util.Scanner;

/**
 * @author pepijn dik
 * @description Bereken bsa punten
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Init alle vakken / projecten
        Vak[] vakken = {
                new Vak("Fasten Your Seatbelts", 12),
                new Vak("Programming", 3),
                new Vak("Databases", 3),
                new Vak("Project skills", 4),
                new Vak("Wiskunde", 2),
                new Vak("User interaction", 3),

        };

        System.out.println("Voer behaalde cijfers in:");

        //Verkrijg cijfers voor elk vak / project
        for (Vak vak : vakken) {
            System.out.print(vak.getNaam() + ":");
            vak.setCijfer(input.nextDouble());
            input.nextLine(); //Clear last enter
        }

        int maxPoints = 0;
        int totalPoints = 0;
        System.out.println("\n");

        //Print Bsa uit voor elk vak / project
        for (Vak vak : vakken) {
            maxPoints += (int) vak.getPunten();
            totalPoints += vak.gehaaldePunten();
            System.out.printf("Vak/Project: %-24s Cijfer:  %-5.1f Behaalde Punten: %d \n", vak.getNaam(), vak.getCijfer(), vak.gehaaldePunten());
        }

        System.out.println("\nTotaal behaalde studie punten: " + totalPoints + "/" + maxPoints);
        if (totalPoints < (maxPoints / 6 * 5)) {
            System.out.println("PAS OP: je light op schema voor een negatief BSA!");
        }
    }
}
