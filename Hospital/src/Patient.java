
public class Patient extends Person {
	Disease disease;

	// Generating name by inheritance from Person class
	public Patient() {
		this.disease = new Disease();
	}

	@Override
	public String toString() {
		return "Patient [disease=" + disease + ", toString()=" + super.toString() + "]";
	}

}
