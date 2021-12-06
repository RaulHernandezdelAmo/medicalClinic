import java.util.Date;

/**
 *
 * @author Raul
 * @author Mario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create the clinic Object
        Clinic cl = new Clinic();
        
        //Add patients
        cl.addPatient("Juan");
        cl.addPatient("Pepe");
        cl.addPatient("Marta");
        cl.addPatient("Andrea");
        
        //Show the patients created
        System.out.println(cl.patientsToString());
        
        //Add services
        cl.addConsultation(new Date(), 200.5, "Head ache");
        cl.addConsultation(new Date(), 10.89, "Cold");
        cl.addMedicalExam(new Date(), 89.4, "Clinical Analyses");
        cl.addMedicalExam(new Date(), 506.7, "Imaging");
        cl.addMedicalExam(new Date(), 108.59, "Check-up");
        
        //Show the services created
        System.out.println(cl.servicesToString());
        
        //Asign the services with the patients
        cl.assignServicePatient(0, 4);
        cl.assignServicePatient(1, 3);
        cl.assignServicePatient(2, 2);
        cl.assignServicePatient(3, 1);
        cl.assignServicePatient(3, 0);
        
        //Show the relation between the patients and the services
        System.out.println(cl.clientsToString());
        
        //Showing the total amount of cost of the services
        System.out.println(cl.calculateReceivedAmount());
    }
    
}
