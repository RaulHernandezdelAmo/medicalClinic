
import java.util.Date;

public class Consultation extends Service {

	private String diagnosis;

	public void Consultation(Date dh, double c) {
            super.Service(dh, c);
	}

	public void setDiagnostic(String d) {//Check the uml bc it says one is string and the other is int ??
		this.diagnosis = d;
	}

}
