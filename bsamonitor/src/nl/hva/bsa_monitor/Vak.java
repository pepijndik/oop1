package nl.hva.bsa_monitor;

/**
 * @author pepijn dik
 * @description Alle attributen voor een vak met de bijhoordende methodes
 */
public class Vak {
    final double MINIMAALCIJFER = 5.5;
    String naam;
    int punten;
    double cijfer;


    /**
     * @param naam
     * @param punten
     */
    public Vak(String naam, int punten){
        this.naam = naam;
        this.punten = punten;
    }


    /**
     * @author pepijn dik
     * @return int points
     */
    public int gehaaldePunten(){

        if ( this.cijfer >= MINIMAALCIJFER) {
            return this.punten;
        }
        return 0;
    }

    /**
     * @author pepijn dik
     * @param nieuwCijfer
     */
    public void setCijfer(double nieuwCijfer) {
        this.cijfer = nieuwCijfer;
    }

    /**
     * @author pepijn dik
     * verkrijg naam
     * @return naam
     */
    public String getNaam(){
        return this.naam;
    }

    /**
     * @author pepijn dik
     * verkrijg punten
     * @return punten
     */
    public int getPunten(){
        return this.punten;
    }

    /**
     * @author pepijn dik
     * verkrijg cijfer
     * @return cijfer
     */
    public double getCijfer(){
        return this.cijfer;
    }

}
