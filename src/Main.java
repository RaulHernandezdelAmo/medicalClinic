import java.util.Date;

/**
 *
 * @author Raul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Clinic cl = new Clinic();
        
        cl.addPatient("Juan");
        cl.addPatient("Pepe");
        cl.addPatient("Marta");
        cl.addPatient("Andrea");
        
        System.out.println(cl.patientsToString());
        
        cl.addConsultation(new Date(), 200.5, "Head ache");
        cl.addConsultation(new Date(), 10.89, "Cold");
        cl.addMedicalExam(new Date(), 89.4, "Clinical Analyses");
        cl.addMedicalExam(new Date(), 506.7, "Imaging");
        cl.addMedicalExam(new Date(), 108.59, "Check-up");
        
        System.out.println(cl.servicesToString());
        
        
        cl.assignServicePatient(0, 4);
        cl.assignServicePatient(1, 3);
        cl.assignServicePatient(2, 2);
        cl.assignServicePatient(3, 1);
        cl.assignServicePatient(3, 0);
        
        System.out.println(cl.clientsToString());
        
        System.out.println(cl.calculateReceivedAmount());
    }
    
}
