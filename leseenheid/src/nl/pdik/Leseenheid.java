package nl.pdik;

/**
 * Leseenheid
 * @author pepijn dik
 *
 */
public class Leseenheid {
    protected String naam;
    protected int ects;
    protected int studiejaar;

    public Leseenheid(String naam,int ects,int studiejaar){
        this.naam = naam;
        this.ects = ects;
        this.studiejaar = studiejaar;
        Double test =0.11111119;

    }
    public double roundTwoDecimal(double number){
        return Math.round(number * 100.00) /100.0;
    }
    @Override
    public String toString() {
        return naam +" " +ects+ " ects, " + "Studiejaar " + this.studiejaar +" ";
    }
}
