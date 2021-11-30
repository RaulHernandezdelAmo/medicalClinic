
import java.util.Date;

public abstract class Service {

	private int cod;
	private Date datehour;
	private double cost;

	public void Service(Date dh, double c) {

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
		return false;
	}

}
