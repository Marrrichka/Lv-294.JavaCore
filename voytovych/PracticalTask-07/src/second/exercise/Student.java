package second.exercise;

public class Student extends Person{
	final String TYPE_PERSON = "Student";
	
	public Student(String name) {
		super(name);
		System.out.println("Type of person: " + TYPE_PERSON);
	}

	@Override
	void print() {
		System.out.println("I am a student.");
		
	}
	
	
	
}