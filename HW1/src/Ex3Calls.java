import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3Calls {

	public static void billing() throws NumberFormatException, IOException {
	    BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));

	System.out.println("Please, enter the cost of 1 minute from Country �1:");
	float c1 = Float.parseFloat(br.readLine());
	
	System.out.println("Please, enter the duration of the call from Country �1:");
	int t1 = Integer.parseInt(br.readLine());
	
	System.out.println("Price of first call is " + c1*t1);
	
	System.out.println("Please, enter the cost of 1 minute from Country �2:");
	float c2 = Float.parseFloat(br.readLine());
	
	System.out.println("Please, enter the duration of the call from Country �2:");
	int t2 = Integer.parseInt(br.readLine());
	
	System.out.println("Price of second call is " + c2*t2);
	
	System.out.println("Please, enter the cost of 1 minute from Country �3:");
	float c3 = Float.parseFloat(br.readLine());
	
	System.out.println("Please, enter the duration of the call from Country �3:");
	int t3 = Integer.parseInt(br.readLine());
	
	System.out.println("Price of third call is " + c3*t3);
	
	System.out.println("Total price of three calls is " + (c1*t1 + c2*t2 + c3*t3));

	}	
}
