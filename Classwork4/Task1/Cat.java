package Task1;

public class Cat implements Animal {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	@Override

	public void voice() {
		System.out.println("���");
	}

	@Override
	public void feed() {
		System.out.println("Feed me!");

	}
}