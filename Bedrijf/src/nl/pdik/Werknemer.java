package nl.pdik;

import nl.pdik.Persoon;

public class Werknemer<laatstePersoneelNummer> extends Persoon {
    private static int laatstePersoneelNummer = 1000;
    protected double maandSalaris;
    protected int personeelsNummer;
    public Werknemer(double maandSalaris, String naam){
        super(naam);
        this.maandSalaris = maandSalaris;
        this.generatePersoneelsNummer();
    }

    private void generatePersoneelsNummer(){
        this.personeelsNummer = Werknemer.laatstePersoneelNummer + 1;
        Werknemer.laatstePersoneelNummer  = this.personeelsNummer;
    }
    @Override
    public double berekenInkomsten() {
        return this.maandSalaris;
    }
}
