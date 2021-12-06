
import java.util.Date;

public abstract class Service {

    private static int count = 0; //for the autoincrement of the service cod
    private int cod;
    private Date datehour;
    private double cost;

    
   /**
    * Constructor for the abstract class Service
    * 
    * @param dh datehour when the service was done
    * @param c cost of the service
    */
    public void Service(Date dh, double c) {
            this.cost=c;
            this.datehour = dh;         
            cod  = count++;
    }

    /**
     * getter of cod
     * 
     * @return int cod
     */
    public int getCod() {
        return this.cod;
    }

    /**
     * getter for datehour
     * 
     * @return Date datehour
     */
    public Date getDatehour() {
        return this.datehour;
    }
    
    /**
     * getter for the cost
     * 
     * @return double cost
     */
    public double getCost() {
        return this.cost;
    }

    //This doesnt have much sense
    public boolean assignPatient(Patient p) {
        return true;
    }
    
    /**
     * Overrided method for printing Services. Not on the original UML, but useful
     *
     * @return String with the service info
     */
    @Override
    public String toString(){
        return "Service description = Cod: "+this.cod+", Date: "+this.datehour+", Cost: "+this.cost;
    }

}
