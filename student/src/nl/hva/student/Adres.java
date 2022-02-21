package nl.hva.student;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Adres class
 *
 * @author pepijn dik
 */
public class Adres {
    String straat, postcode, plaats;
    int huisnr;

    /**
     * construct
     *
     * @param straat
     * @param huisnr
     * @param postcode
     * @param plaats
     */
    public Adres(String straat, int huisnr, String postcode, String plaats) {
        this.straat = straat;
        this.huisnr = huisnr;
        this.postcode = postcode;
        this.plaats = plaats;
    }

    /**
     * To string
     *
     * @return String
     */
    public String toString() {
        return "" + this.straat + " " + this.postcode + " " + this.plaats;
    }

    /**
     * Valideer postcode with regex
     * @param postcode
     * @return boolean
     */
    public static boolean checkPostcode(String postcode) {
        if(postcode != ""){
            String regex = "^[1-9][0-9]{3} ?(?!sa|sd|ss)[a-z]{2}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(postcode);
            return matcher.matches();
        }
        return false;
    }

}
