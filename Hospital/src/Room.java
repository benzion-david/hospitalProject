import java.util.Arrays;

public class Room {
	private static int roomCounter = 0;
	private int roomNumber = ++roomCounter;
	Doctor doctor;
	Nurse nurse;
	Patient[] patients = new Patient[5];

	public Room() {
		this.doctor = new Doctor();
		this.doctor.roomNumber = this.roomNumber;
		this.nurse = new Nurse();
		this.nurse.roomNumbersResponsible[0] = this.roomNumber;
		while (this.nurse.roomNumbersResponsible[0] == this.nurse.roomNumbersResponsible[1]) {
			this.nurse.roomNumbersResponsible[1] = BentziUtils.randIntBetween(1, 10);
		}
		for (int i = 0; i < patients.length; i++) {
			this.patients[i] = new Patient();

		}

	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", doctor=" + doctor + "\n nurse=" + nurse + ", patinets="
				+ Arrays.toString(patients) + ", toString()=" + super.toString() + "]";
	}

}
