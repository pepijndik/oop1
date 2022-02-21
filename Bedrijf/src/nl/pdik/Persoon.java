package nl.pdik;

import java.util.Collections;

public abstract class Persoon{
    private String naam;
    protected Persoon(String naam) {
        this.naam = naam;
    }
    public abstract  double berekenInkomsten();

    public int compareTo(Persoon ander) {
        return 0;
    }

    public double roundNumber(double number){
        return Math.round(number * 100.00) /100.0;
    }
    public String toString() {
        return this.naam;
    }
}
