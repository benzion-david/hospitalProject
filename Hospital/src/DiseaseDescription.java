
public enum DiseaseDescription {
	Tuberculosis(0), Pneumonia(1), Covid(2), Fracture(3), Cardio(4);

	private final int value;

	// TODO - what is the relation between the value and the attributes?
	private DiseaseDescription(int value) {
		this.value = value;
	}

	public static int randomNumber() {
		int random = (int) (Math.random() * DiseaseDescription.values().length);
		return random;
	}

}
