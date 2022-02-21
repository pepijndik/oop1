package nl.pdik;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


/**
 *
 */
public class Bedrijf {
    private String naam;
    private final ArrayList<Persoon> medewerkers = new ArrayList<Persoon>();

    public Bedrijf(String naam) {
        this.naam = naam;
    }


    /**
     * Tel aantal medewerkers welke manager is
     *
     * @return int
     */
    public int aantalManagers() {
        AtomicInteger aantalManagers = new AtomicInteger();
        medewerkers.forEach((medewerker) -> {
            if (medewerker instanceof Manager) {
                aantalManagers.getAndIncrement();
            }
        });
        return aantalManagers.get();
    }

    /**
     * Print inkomsten
     */
    public void printInkomsten() {
        System.out.print("Inkomsten van alle personen:\n");

        medewerkers.forEach((medewerker) -> {

            if (medewerker instanceof Vrijwilliger) {
                System.out.printf("\t\t%s, %s\n", medewerker.toString(), "bedankt voor uw inzet!\n");
            } else {
                System.out.printf("\t\t%s, inkomsten: %-12.2f\n", medewerker.toString(), medewerker.berekenInkomsten());
            }

        });
    }

    public void neemInDienst(Persoon Medewerker) {
        this.medewerkers.add(Medewerker);
    }

    @Override
    public String toString() {
        StringBuilder bedrijfString = new StringBuilder("Bedrijf HvA heeft " + this.medewerkers.size() + " medewerkers:\n");
        medewerkers.forEach((medewerker) -> {
            bedrijfString.append("\t\t").append(medewerker.toString()).append("\n");
        });
        return bedrijfString.toString();
    }
}
