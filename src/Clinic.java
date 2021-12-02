
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Clinic {
    
    
    private TreeMap<Integer, Service> services = new TreeMap<>();    
    private TreeMap<Integer, Patient> patients = new TreeMap<>();
    private LinkedHashMap<Integer, ArrayList> clients = new LinkedHashMap<>();

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
        if(clients.containsKey(numID)){
            ArrayList<Integer> clientServices = new ArrayList<>(clients.get(numID));
            clientServices.add(cod);
            clients.put(numID, clientServices);
        }else{
            ArrayList<Integer> clientServices = new ArrayList<>();
            clientServices.add(cod);
            clients.put(numID, clientServices);
        }
    }

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
    
    public String patientsToString(){  
        String returnString = "";
        if(patients.isEmpty() == false){
            for(int key:patients.keySet()){
                returnString += "\n" +patients.get(key).toString();
            }
        }
        return returnString;
    }
    
    public String servicesToString(){  
        String returnString = "";
        if(services.isEmpty() == false){
            for(int key:services.keySet()){
                returnString += "\n" +services.get(key).toString();
            }
        }
        return returnString;
    }
    
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
