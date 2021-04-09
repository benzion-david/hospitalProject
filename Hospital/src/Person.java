
public abstract class Person {
	private static int counter = 0;
	private int id = ++counter;
	private String name;
	private int age;

	public Person() {
		this.id = id;
		this.name = BentziUtils.generateName();
		this.age = BentziUtils.randIntBetween(18, 120);

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
