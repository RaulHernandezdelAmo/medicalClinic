
import java.util.Date;

public class Consultation extends Service {

    private String diagnosis;

    /**
     * Constructor for Consultations
     * 
     * @param dh
     * @param c 
     */
    public Consultation(Date dh, double c) {
        super.Service(dh, c);
    }

    /**
     * Setter of diagnosis
     * @param d  String diagnosis
     */
    public void setDiagnostic(String d) {
            this.diagnosis = d;
    }
    
    /**
     * Override method for printing Consultations. Not on the original UML, but useful
     *
     * @return String with the Consultation
     */
    @Override
    public String toString(){
        return super.toString() + " diagnosis: " + diagnosis;
    }
}
    