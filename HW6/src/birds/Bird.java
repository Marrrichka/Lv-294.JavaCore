/**Develop abstract class Bird with attributes feathers 
 * and layEggs and an abstract method fly(). �
 * Develop classes FlyingBird and NonFlyingBird. 
 * Create class Eagle, Swallow, Penguin and Chicken. 

Create array Bird and add different birds to it. 
Call fly() method for all
of it. Output the 
information about 
each type of 
created bird.
 */

package birds;

public abstract class Bird {
		
	private String feathers;
	private int layEggs;
	
	public void fly () {
		
	}
	
	
	public static void main(String[] args) {
		
		Bird [] birds = new Bird[5];
		 birds[0] = new Penguin();
		 birds[1] = new Swallow();
		 birds[2] = new Chicken();
		 birds[3] = new Penguin();
		 birds[4] = new Eagle();
		 birds[1].fly();
	}

}