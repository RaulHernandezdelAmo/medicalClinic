
import java.util.Date;

public abstract class Service {

    private static int count = 0;
    private int cod;
    private Date datehour;
    private double cost;


    public void Service(Date dh, double c) {
            this.cost=c;
            this.datehour = dh;         
            cod  = count++;
    }

    public void Service() {
    }

    public int getCod() {
        return this.cod;
    }

    public Date getDatehour() {
        return this.datehour;
    }

    public double getCost() {
        return this.cost;
    }

    public boolean assignPatient(Patient p) {
        return true;
    }
    
    @Override
    public String toString(){
        return "Service description = Cod: "+this.cod+", Date: "+this.datehour+", Cost: "+this.cost;
    }

}
