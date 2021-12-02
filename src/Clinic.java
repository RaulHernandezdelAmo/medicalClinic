
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Clinic {
    
    
    private TreeMap<Integer, Service> services = new TreeMap<>();    
    private TreeMap<Integer, Patient> patients = new TreeMap<>();
    private LinkedHashMap<Integer, Integer> clients = new LinkedHashMap<>();

    public void Clinic() {
        services = new TreeMap<>();
        patients = new TreeMap<>();
        clients = new LinkedHashMap<>();
    }

    public boolean addPatient(String n) {
        
        Patient p = new Patient(n);
        patients.put(p.getNumID(), p);
        if(patients.containsKey(p.getNumID())){
            return true;
        }else{
            return false;
        }
    }

    /*
    public boolean addService(Date dh, double c) {
        Service s = new Service(dh, c);
        s.services.add(s);
        if(s.services.contains(s)){
            return true;
        }else{
            return false;
        }
    }
    */
    
    
    public boolean addMedicalExam(Date dh, double c, String t) {
        MedicalExam me = new MedicalExam(dh, c, t);
        services.put(me.getCod(), me);
        System.out.println(services);
        if(services.containsKey(me.getCod())){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean addConsultation(Date dh, double c, String d) {
        Consultation con = new Consultation(dh, c);
        con.setDiagnostic(d);
        services.put(con.getCod(), con);
        if(services.containsKey(con.getCod())){
            return true;
        }else{
            return false;
        }
    }

    public void assignServicePatient(int numID, int cod) {
        
        clients.put(numID, cod);
        System.out.println(clients);
    }

    public double calculateReceivedAmount() {
            return 0;
    }

}
