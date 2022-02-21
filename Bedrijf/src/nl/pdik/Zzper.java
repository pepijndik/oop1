package nl.pdik;

import nl.pdik.interfaces.Oproepbaar;

public class Zzper extends Persoon implements Oproepbaar {

    private double uurTarief;
    private int urenGewerkt;
    protected Zzper(double uurTarief, String naam) {
        super(naam);
        this.uurTarief = uurTarief;
    }

    @Override
    public double berekenInkomsten() {
      return  this.urenGewerkt * this.uurTarief;
    }

    @Override
    public void huurIn(int uren) {
        this.urenGewerkt += uren;
    }


}
