
import java.util.LinkedHashSet;

public class Patient {

        private static int count = 0;
	private int numID;
	private String name;
        


	public Patient(String n) {
            this.name = n;
            this.numID = count++;
	}

	public int getNumID() {
		return this.numID;
	}

	public String getName() {
		return this.name;
	}

}
