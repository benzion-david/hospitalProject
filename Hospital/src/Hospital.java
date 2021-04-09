import java.util.Arrays;

public class Hospital {

	protected Room[] rooms = new Room[10];
	protected String name;

	public Hospital() {
		for (int i = 0; i < rooms.length; i++) {
			this.rooms[i] = new Room();
			this.name = "Ichilov";

		}
	}

	@Override
	public String toString() {
		return "Hospital [rooms=" + Arrays.toString(rooms) + ", name=" + name + "]";
	}

}
