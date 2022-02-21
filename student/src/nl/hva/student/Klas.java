package nl.hva.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Class klas
 *
 * @author pepijn dik
 */
public class Klas {
    final int MAX_AANTAL_STUDENTEN = 30;

    String naam;
    int aantalStudenten = 0;
    List<Student> studenten = new ArrayList<Student>();

    /**
     * Construct
     * @param naam
     */
    public Klas(String naam) {
        this.naam = naam;
    }

    /**
     * Voeg nieuwe student toe aan lijst
     *
     * @param student
     * @return boolean
     */
    public boolean voegStudentToe(Student student) {
        if (this.aantalStudenten < MAX_AANTAL_STUDENTEN) {
            this.studenten.add(student);
            this.aantalStudenten = this.studenten.size();
            return true;
        }
        return false;
    }

    /**
     * Voeg meerdere studenten toe
     *
     * @param students
     */
    public void voegStudentenToe(Student[] students) {
        studenten.addAll(Arrays.asList(students));
    }

    /**
     * @return aantalStudenten
     */
    public int getAantalStudenten() {
        return this.aantalStudenten;
    }

    /**
     * Verkijg string van de klas
     *
     * @return String
     */
    public String toString() {
        StringBuilder completeLijst = new StringBuilder();
        completeLijst.append("Klas: ").append(this.naam).append(" (").append(this.aantalStudenten).append(" studenten)\n");
        for (Student student : studenten) {
            completeLijst.append(student.toString()).append("\n");
        }
        return completeLijst.toString();
    }
}
