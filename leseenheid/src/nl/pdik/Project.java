package nl.pdik;

/**
 *
 */
public class Project extends Leseenheid {
    final int MINIMAALCIJFER = -1;
    final double ONDERGRENS_VOLDOENDE = 5.5;
    private double productcijfer;
    private double procescijfer;
    private double methodenEnTechniekenCijfer;

    /**
     * @param productcijfer
     * @param procescijfer
     * @param methodeEnTechniekenCijfer
     * @param naam
     * @param ects
     * @param studiejaar
     */
    public Project(double productcijfer, double procescijfer, double methodeEnTechniekenCijfer, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.procescijfer = procescijfer;
        this.productcijfer = productcijfer;
        this.methodenEnTechniekenCijfer = methodeEnTechniekenCijfer;
    }
    public Project(String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.procescijfer = MINIMAALCIJFER;
        this.productcijfer = MINIMAALCIJFER;
        this.methodenEnTechniekenCijfer = MINIMAALCIJFER;
    }

    public void setMethodenEnTechniekenCijfer(double MethodenEnTechniekenCijfer) {
        this.methodenEnTechniekenCijfer = super.roundTwoDecimal(MethodenEnTechniekenCijfer);
    }

    public void setProcescijfer(double procescijfer) {
        this.procescijfer = super.roundTwoDecimal(procescijfer);
    }

    public void setProductcijfer(double productcijfer) {
        this.productcijfer = super.roundTwoDecimal(productcijfer);
    }


    public boolean isAfgerond(){

        if (this.procescijfer >= ONDERGRENS_VOLDOENDE && this.productcijfer >= ONDERGRENS_VOLDOENDE && this.methodenEnTechniekenCijfer >= ONDERGRENS_VOLDOENDE){
            return  true;
        }
        return false;
    }

    public String toString() {
        return super.toString() + " " +productcijfer + " " + procescijfer + " " + methodenEnTechniekenCijfer;
    }

}
