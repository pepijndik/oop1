package nl.hva.student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    int studentNr;
    String voornaam,achternaam;
    Adres adres;
    LocalDate geboorteDatum;

    /**
     * Construct
     * @param studentNr
     * @param voornaam
     * @param achternaam
     * @param geboorteDatum
     * @param adres
     */
    public Student(int studentNr, String voornaam, String achternaam, LocalDate geboorteDatum, Adres adres){
        this.studentNr = studentNr;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboorteDatum = geboorteDatum;
        this.adres = adres;
    }

    /**
     * Student to string
     * @return String
     */
    public String toString(){
        return ""+ this.studentNr + " "+ this.voornaam + " " + this.achternaam + " " + this.korteGeboorteDatum() + " " + this.adres.toString();
    }

    /**
     * GeboorteDatum naar korte text
     * @return
     */
    public String korteGeboorteDatum(){
        return this.geboorteDatum.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
    }
}
