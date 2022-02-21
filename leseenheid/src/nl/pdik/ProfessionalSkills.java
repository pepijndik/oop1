package nl.pdik;

public class ProfessionalSkills extends Leseenheid{

    private Boolean gehaald;
    public ProfessionalSkills(Boolean gehaald,String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.gehaald = gehaald;
    }
    public ProfessionalSkills(String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.gehaald = false;
    }


    public void setGehaald(Boolean gehaald) {
        this.gehaald = gehaald;
    }

    /**
     * Verkrijg custom wel of niet gehaalde
     * @return String
     */
    public String getGehaaldString(){
        if(this.gehaald){
            return "wel";
        }else{
            return "niet";
        }
    }

    public String toString() {
        return  super.toString()
                + " " +this.getGehaaldString()+
                " gehaald";
    }

    public Boolean isAfgerond() {
       if(this.gehaald){
           return true;
       }
       return false;
    }
}
