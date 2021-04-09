import java.util.Arrays;

public class Nurse extends Person {
	int[] roomNumbersResponsible;

	public Nurse() {

		int num = 0;
		if (Math.random() > 0) {
			this.roomNumbersResponsible = new int[2];
			this.roomNumbersResponsible[0] = BentziUtils.randIntBetween(1, 10);
			this.roomNumbersResponsible[1] = BentziUtils.randIntBetween(1, 10);
			while (roomNumbersResponsible[0] == roomNumbersResponsible[1]) {
				this.roomNumbersResponsible[1] = BentziUtils.randIntBetween(1, 10);

			}

		} else {
			this.roomNumbersResponsible = new int[1];
			this.roomNumbersResponsible[0] = BentziUtils.randIntBetween(1, 10);

		}

	}

	public int[] getRoomNumbersResponsible() {
		return roomNumbersResponsible;
	}

	public void setRoomNumbersResponsible(int[] roomNumbersResponsible) {
		this.roomNumbersResponsible = roomNumbersResponsible;
	}

	@Override
	public String toString() {
		return "Nurse [roomNumbersResponsible=" + Arrays.toString(roomNumbersResponsible) + ", toString()="
				+ super.toString() + "]";
	}
}