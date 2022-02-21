package nl.pdik;

public class Manager extends Werknemer {
    private double bonus;

    public Manager(int maandSalaris, String naam) {
        super(maandSalaris, naam);
    }

    @Override
    public double berekenInkomsten() {
        return super.maandSalaris += this.bonus;
    }

    /**
     * Set bonus
     * @param bonus
     */
    public void kenBonusToe(double bonus) {
        this.bonus = bonus;
    }
}
