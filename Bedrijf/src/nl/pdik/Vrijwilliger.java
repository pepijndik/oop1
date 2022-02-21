package nl.pdik;

import nl.pdik.interfaces.Oproepbaar;

public class Vrijwilliger extends Persoon implements Oproepbaar {
    public Vrijwilliger(String naam) {
        super(naam);
    }

    @Override
    public double berekenInkomsten() {
        return 0;
    }

    public void huurIn(int uren) {
    }

}
