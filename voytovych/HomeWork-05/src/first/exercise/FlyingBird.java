package first.exercise;

public class FlyingBird extends Bird {

	public FlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public void fly() {
		System.out.println("This bird can fly.");		
	}

}