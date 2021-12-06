
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Clinic {
    
    private TreeMap<Integer, Service> services = new TreeMap<>(); //TreeMap that relates an ID with its Service   
    private TreeMap<Integer, Patient> patients = new TreeMap<>(); //TreeMap that relates an ID with its Patient 
    private LinkedHashMap<Integer, ArrayList> clients = new LinkedHashMap<>(); //TreeMap that relates the ID of a patient with the IDs of its services (Relation 1..n)

    /**
     * Constructor for Clinic class
     */
    public void Clinic() {
        services = new TreeMap<>();
        patients = new TreeMap<>();
        clients = new LinkedHashMap<>();
    }

    /**
     * method for adding a patient
     * 
     * @param n name of the patient
     * @return boolean true if creation was done, false if not
     */
    public boolean addPatient(String n) {
        
        Patient p = new Patient(n);
        patients.put(p.getNumID(), p);
        if(patients.containsKey(p.getNumID())){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * method for adding a medical exam to the services
     * 
     * @param dh datahour of the medical exam
     * @param c cost of the medical exam
     * @param t tipology of the medical exam
     * @return boolean true if creation was done, false if not
     */
    public boolean addMedicalExam(Date dh, double c, String t) {
        MedicalExam me = new MedicalExam(dh, c, t);
        services.put(me.getCod(), me);
        if(services.containsKey(me.getCod())){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * method for adding a consultation to the services
     * 
     * @param dh datahour of the medical exam
     * @param c cost of the medical exam
     * @param d diagnosis of the consultation
     * @return boolean true if creation was done, false if not
     */
    public boolean addConsultation(Date dh, double c, String d) {
        
        //Although in the UML this doesnt require a d String as parameter, I added becasue if not we do not assign the diagnosis anywhere
        Consultation con = new Consultation(dh, c);
        con.setDiagnostic(d);
        services.put(con.getCod(), con);
        if(services.containsKey(con.getCod())){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * method for relating a service to a patient
     * 
     * @param numID id of the patient
     * @param cod id of the service
     */
    public boolean assignServicePatient(int numID, int cod) {
        if(clients.containsKey(numID)){
            ArrayList<Integer> clientServices = new ArrayList<>(clients.get(numID));
            clientServices.add(cod);
            clients.put(numID, clientServices);
        }else{
            ArrayList<Integer> clientServices = new ArrayList<>();
            clientServices.add(cod);
            clients.put(numID, clientServices);
        }
        if(clients.containsKey(numID) && clients.get(numID).contains(cod)){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * method to calculate the total amount of money from the services
     * 
     * @return double 0.0 if no services, the summ of all the cost if not
     */
    public double calculateReceivedAmount() {
        double total = 0.0;
        for (int key:clients.keySet()){
            ArrayList value = clients.get(key);
            Iterator<Integer> it = value.iterator();
            while(it.hasNext()){
                total += services.get(it.next()).getCost();
            }
        }
        return Math.round(total * 100.0) / 100.0;
    }
    
    /**
     * method not included in the original uml, but useful to print the patients
     * 
     * @return String with the patients
     */
    public String patientsToString(){  
        String returnString = "";
        if(patients.isEmpty() == false){
            for(int key:patients.keySet()){
                returnString += "\n" +patients.get(key).toString();
            }
        }
        return returnString;
    }
    
     /**
     * method not included in the original uml, but useful to print the services
     * 
     * @return String with the services
     */
    public String servicesToString(){  
        String returnString = "";
        if(services.isEmpty() == false){
            for(int key:services.keySet()){
                returnString += "\n" +services.get(key).toString();
            }
        }
        return returnString;
    }
    
    /**
     * method not included in the original uml, but useful to print the relations of patients and services
     * 
     * @return String with the patients and their services
     */
    public String clientsToString(){  
        String returnString = "";
        if(clients.isEmpty() == false){
            for(int key:clients.keySet()){
                returnString += "\n" +patients.get(key).toString();
                ArrayList value = clients.get(key);
                Iterator<Integer> it = value.iterator();
                while(it.hasNext()){
                    returnString += "\n                      " +services.get(it.next()).toString();
                }
            }
        }
        return returnString+"\n";
    }

}
