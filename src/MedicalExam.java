
import java.util.Date;

public class MedicalExam extends Service {

    private String typology;

    public MedicalExam(Date dh, double c, String t) {
        super.Service(dh, c);
        this.typology = t;
    }
        
    @Override
    public String toString(){
        return super.toString() + " typology: " + typology;
    }

}
