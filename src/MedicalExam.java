
import java.util.Date;

public class MedicalExam extends Service {

    private String typology;

    /**
     * Constructor for MedicalExam
     * 
     * @param dh datehour of the exam
     * @param c cost of the exam
     * @param t tipology of the exam
     */
    public MedicalExam(Date dh, double c, String t) {
        super.Service(dh, c);
        this.typology = t;
    }
    
    /**
     * Overrided method for printing Medical Exams. Not on the original UML, but useful
     *
     * @return String with the medical exams
     */
    @Override
    public String toString(){
        return super.toString() + " typology: " + typology;
    }

}
