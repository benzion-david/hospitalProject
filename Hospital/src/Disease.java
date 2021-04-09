
public class Disease {
	DiseaseDescription diseaseDescription;
	int timeToCure = timetocure();

	public Disease() {
		this.diseaseDescription = diseaseDescription.values()[DiseaseDescription.randomNumber()];
		this.timeToCure = timetocure();

	}

	@Override
	public String toString() {
		return "Disease [diseaseDescription=" + diseaseDescription + ", timeTOCURE=" + timeToCure + "]";
	}

	public static int timetocure() {
		int curetime = (int) (Math.random() * 19 + 3);
		return curetime;
	}

}
