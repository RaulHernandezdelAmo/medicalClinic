
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        
        cl.addConsultation(new Date(), 200.5, "Head ache");
        cl.addConsultation(new Date(), 10.89, "Cold");
        cl.addMedicalExam(new Date(), 89.4, "Clinical Analyses");
        cl.addMedicalExam(new Date(), 506.7, "Imaging");
        cl.addMedicalExam(new Date(), 108.59, "Check-up");
        
        
        cl.assignServicePatient(0, 3);
        cl.assignServicePatient(1, 2);
        cl.assignServicePatient(2, 1);
        cl.assignServicePatient(3, 0);
    }
    
}
