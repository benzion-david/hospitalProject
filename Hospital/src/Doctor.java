
public class Doctor extends Person {
	private Disease specialty;
	protected int roomNumber;

	public Doctor() {
		this.specialty = new Disease();
		this.roomNumber = BentziUtils.randIntBetween(1, 10);

	}

	@Override
	public String toString() {
		return "Doctor [specialty=" + specialty + ", roomNumber=" + roomNumber + ", toString()=" + super.toString()
				+ "]";
	}

}
