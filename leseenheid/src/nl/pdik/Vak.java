package nl.pdik;

/**
 * Vak
 * Class holds all methods ands variables for vak
 * @author pepijn dik
 * @since 16-12-2021
 */
public class Vak extends  Leseenheid{
    private double cijfer;
    final int MINIMAALCIJFER = -1;
    final double ONDERGRENS_VOLDOENDE = 5.5;
    /**
     *  Vak constructor
     * @param cijfer
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public Vak(double cijfer,String naam, int ects, int studiejaar) {
        super(naam,ects,studiejaar);
        this.cijfer = cijfer;
    }

    /**
     * Vak constructor
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public Vak(String naam,int ects, int studiejaar) {
        super(naam,ects,studiejaar);
        this.cijfer = MINIMAALCIJFER;
    }

    public void setCijfer(double cijfer) {
     this.cijfer = super.roundTwoDecimal(cijfer);
    }

    /**
     * bekijk of vak is afgerond
     * @return
     */
    public boolean isAfgerond(){
        if(this.cijfer >= ONDERGRENS_VOLDOENDE){
            return  true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + this.cijfer;
    }
}
