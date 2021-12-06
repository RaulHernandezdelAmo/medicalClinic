
public class Patient {

    private static int count = 0; //for the autoincrement of the numID
    private int numID;
    private String name;


    /**
     * constructor for Patient
     * 
     * @param n name of patient
     */
    public Patient(String n) {
        this.name = n;
        this.numID = count++; //autoincrement numID
    }

    /**
     * getter for numID
     * 
     * @return int numID
     */
    public int getNumID() {
        return this.numID;
    }

    /**
     * getter for name
     * 
     * @return String name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Overrided method for printing Patients. Not on the original UML, but useful
     *
     * @return String with the patients info
     */
    @Override
    public String toString(){
        return "Patient description = NumID: "+this.numID+", Name: "+this.name;
    }

}
